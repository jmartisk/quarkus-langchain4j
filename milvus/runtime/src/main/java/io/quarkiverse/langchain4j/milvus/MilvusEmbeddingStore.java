package io.quarkiverse.langchain4j.milvus;

import static dev.langchain4j.internal.Utils.randomUUID;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingMatch;
import dev.langchain4j.store.embedding.EmbeddingStore;
import io.milvus.grpc.CollectionSchema;
import io.milvus.grpc.CreateCollectionRequest;
import io.milvus.grpc.CreateIndexRequest;
import io.milvus.grpc.DataType;
import io.milvus.grpc.DescribeCollectionRequest;
import io.milvus.grpc.DescribeCollectionResponse;
import io.milvus.grpc.FieldData;
import io.milvus.grpc.FieldSchema;
import io.milvus.grpc.FloatArray;
import io.milvus.grpc.HasCollectionRequest;
import io.milvus.grpc.InsertRequest;
import io.milvus.grpc.KeyValuePair;
import io.milvus.grpc.LoadCollectionRequest;
import io.milvus.grpc.MilvusService;
import io.milvus.grpc.MutationResult;
import io.milvus.grpc.ScalarField;
import io.milvus.grpc.SearchRequest;
import io.milvus.grpc.SearchResults;
import io.milvus.grpc.Status;
import io.milvus.grpc.StringArray;
import io.milvus.grpc.VectorField;
import io.quarkiverse.langchain4j.milvus.runtime.MetricType;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusClientException;
import io.quarkus.arc.impl.LazyValue;
import io.quarkus.logging.Log;

public class MilvusEmbeddingStore implements EmbeddingStore<TextSegment> {

    private final LazyValue<Object> collectionExists;
    private final String dbName;
    private final String collectionName;
    private final MetricType metricType;
    private final String idFieldName;
    private final String vectorFieldName;
    private final String textFieldName;

    // TODO make configurable
    private final Duration timeout = Duration.ofSeconds(10);

    private MilvusService client;

    public MilvusEmbeddingStore(boolean createCollection,
            MilvusService client,
            String authToken,
            Duration timeout,
            String dbName,
            String collectionName,
            Integer dimension,
            MetricType metricType,
            String idField,
            String vectorField,
            String textField) {
        this.client = client;
        this.dbName = dbName;
        this.collectionName = collectionName;
        this.metricType = metricType;
        this.idFieldName = idField;
        this.vectorFieldName = vectorField;
        this.textFieldName = textField;

        this.collectionExists = new LazyValue<>(new Supplier<Object>() {
            @Override
            public Object get() {
                HasCollectionRequest request = HasCollectionRequest.newBuilder().setCollectionName(collectionName).build();
                if (client.hasCollection(request).await().atMost(timeout).getValue()) {
                    Log.info("Collection " + collectionName + " already exists");
                } else {
                    Log.info("Collection " + collectionName + " does not exist, creating");
                    createCollection(collectionName, dimension, dbName, client, timeout);
                    createIndex(dbName, collectionName, client, timeout);
                }
                return new Object();
            }
        });
    }

    private void createIndex(String dbName, String collectionName, MilvusService client, Duration timeout) {
        CreateIndexRequest createIndex = CreateIndexRequest.newBuilder()
                .setDbName(dbName)
                .setCollectionName(collectionName)
                // TODO: how to specify metricType?
                .setFieldName(vectorFieldName)
                .build();
        client.createIndex(createIndex).await().atMost(timeout);
    }

    private void createCollection(String collectionName, Integer dimension, String dbName, MilvusService client,
            Duration timeout) {
        if (dimension == null) {
            throw new IllegalArgumentException(
                    "quarkus.langchain4j.milvus.dimension must be specified when creating a new collection");
        }
        FieldSchema idField = FieldSchema.newBuilder()
                .setName(idFieldName)
                .setAutoID(false)
                .setIsPrimaryKey(true)
                .setDataType(DataType.VarChar)
                .addTypeParams(KeyValuePair.newBuilder().setKey("max_length").setValue("256").build())
                .build();
        FieldSchema textField = FieldSchema.newBuilder()
                .setName(textFieldName)
                .setIsPrimaryKey(false)
                .setDataType(DataType.VarChar)
                // TODO: make the max_length configurable???
                .addTypeParams(KeyValuePair.newBuilder().setKey("max_length").setValue("4096").build())
                .build();
        FieldSchema vectorField = FieldSchema.newBuilder()
                .setName(vectorFieldName)
                .setIsPrimaryKey(false)
                .setDataType(DataType.FloatVector)
                .addTypeParams(KeyValuePair.newBuilder().setKey("dim").setValue(String.valueOf(dimension)).build())
                .build();
        CreateCollectionRequest create = CreateCollectionRequest.newBuilder()
                .setDbName(dbName)
                .setCollectionName(collectionName)
                .setSchema(CollectionSchema.newBuilder()
                        .setName(collectionName)
                        .addFields(idField)
                        .addFields(textField)
                        .addFields(vectorField)
                        .build().toByteString())
                .build();
        Status status = client.createCollection(create).await().atMost(timeout);
        if (status.getCode() != 0) {
            throw new MilvusClientException(status.getReason());
        }
    }

    @Override
    public String add(Embedding embedding) {
        String id = randomUUID();
        add(id, embedding);
        return id;
    }

    @Override
    public void add(String id, Embedding embedding) {
        addInternal(id, embedding, null);
    }

    @Override
    public String add(Embedding embedding, TextSegment textSegment) {
        String id = randomUUID();
        addInternal(id, embedding, textSegment);
        return id;
    }

    @Override
    public List<String> addAll(List<Embedding> embeddings) {
        List<String> ids = embeddings.stream()
                .map(ignored -> randomUUID())
                .collect(toList());
        addAllInternal(ids, embeddings, null);
        return ids;
    }

    @Override
    public List<String> addAll(List<Embedding> embeddings, List<TextSegment> embedded) {
        List<String> ids = embeddings.stream()
                .map(ignored -> randomUUID())
                .collect(toList());
        addAllInternal(ids, embeddings, embedded);
        return ids;
    }

    @Override
    public List<EmbeddingMatch<TextSegment>> findRelevant(Embedding embedding, int maxResults, double minScore) {
        collectionExists.get();
        System.out.println("FINDING");
        DescribeCollectionRequest describeRequest = DescribeCollectionRequest.newBuilder()
                .setDbName(dbName)
                .setCollectionName(collectionName)
                .build();
        client.loadCollection(LoadCollectionRequest.newBuilder()
                .setDbName(dbName).setCollectionName(collectionName).build()).await().atMost(timeout);
        DescribeCollectionResponse description = client.describeCollection(describeRequest).await().atMost(timeout);
        System.out.println("Described: " + description);
        SearchRequest request = SearchRequest.newBuilder()
                .setDbName(dbName)
                .setCollectionName(collectionName)
                .addOutputFields(idFieldName)
                .addOutputFields(textFieldName)
                .addOutputFields(vectorFieldName)
                .setNq(1)
                // TODO HOW TO ADD THE REFERENCE VECTOR HERE???
                .build();
        System.out.println("REQUEST: " + request);
        SearchResults searchResults = client.search(request).await().atMost(timeout);
        System.out.println("RESPONSE:");
        System.out.println("STATUSL " + searchResults.getStatus());
        System.out.println(searchResults.getResults());
        // TODO
        return null;

        //        QueryRequest request = new QueryRequest(namespace, (long) maxResults, true, true, embedding.vector());
        //        QueryResponse response = vectorOperations.query(request);
        //        return response
        //                .getMatches().stream().map(match -> new EmbeddingMatch<>(
        //                        RelevanceScore.fromCosineSimilarity(match.getScore()),
        //                        match.getId(),
        //                        new Embedding(match.getValues()),
        //                        match.getMetadata().get(textFieldName) != null ? new TextSegment(
        //                                match.getMetadata().get(textFieldName),
        //                                new Metadata(mapWithoutKey(match.getMetadata(), textFieldName))) : null))
        //                .filter(match -> match.score() >= minScore)
        //                .collect(toList());
    }

    public Map<String, String> mapWithoutKey(Map<String, String> input, String key) {
        return input.entrySet().stream()
                .filter(entry -> !entry.getKey().equals(key))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private void addInternal(String id, Embedding embedding, TextSegment textSegment) {
        addAllInternal(singletonList(id), singletonList(embedding), textSegment == null ? null : singletonList(textSegment));
    }

    private void addAllInternal(List<String> ids, List<Embedding> embeddings, List<TextSegment> textSegments) {
        collectionExists.get();
        int count = ids.size();

        StringArray idArray = StringArray.newBuilder().addAllData(ids).build();
        FieldData idData = FieldData.newBuilder()
                .setFieldName(idFieldName)
                .setScalars(ScalarField.newBuilder().setStringData(idArray).build())
                .build();

        StringArray textArray = StringArray.newBuilder()
                .addAllData(textSegments.stream().map(s -> s.text()).collect(Collectors.toList())).build();
        FieldData textData = FieldData.newBuilder()
                .setFieldName(textFieldName)
                .setScalars(ScalarField.newBuilder().setStringData(textArray).build())
                .build();

        FloatArray vectorArray = FloatArray.newBuilder()
                .addAllData(embeddings.get(0).vectorAsList()) // !!!!!
                .build();
        FieldData vectorData = FieldData.newBuilder()
                .setFieldName(vectorFieldName)
                .setVectors(VectorField.newBuilder()
                        .setDim(embeddings.get(0).dimensions())
                        .setFloatVector(vectorArray).build())
                .build();

        InsertRequest insertRequest = InsertRequest.newBuilder()
                .setDbName(dbName)
                .setCollectionName(collectionName)
                .addFieldsData(idData)
                .addFieldsData(textData)
                .addFieldsData(vectorData)
                .setNumRows(count)
                .build();
        System.out.println("-----------------------------");
        System.out.println("INSERT REQUEST:");
        System.out.println(insertRequest);
        MutationResult mutationResult = client.insert(insertRequest).await().atMost(timeout);
        System.out.println("-----------------------------");
        System.out.println("INSERT RESULT:");
        System.out.println(mutationResult);
    }

}
