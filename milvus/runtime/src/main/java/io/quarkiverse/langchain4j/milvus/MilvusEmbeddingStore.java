package io.quarkiverse.langchain4j.milvus;

import static dev.langchain4j.internal.Utils.randomUUID;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;

import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingMatch;
import dev.langchain4j.store.embedding.EmbeddingStore;
import io.quarkiverse.langchain4j.milvus.runtime.CreateCollectionRequest;
import io.quarkiverse.langchain4j.milvus.runtime.MetricType;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusClientException;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusCollectionOperationsApi;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusVectorOperationsApi;
import io.quarkiverse.langchain4j.milvus.runtime.SearchRequest;
import io.quarkiverse.langchain4j.milvus.runtime.SearchResponse;
import io.quarkiverse.langchain4j.milvus.runtime.UpsertRequest;
import io.quarkiverse.langchain4j.milvus.runtime.UpsertResponse;
import io.quarkus.arc.impl.LazyValue;
import io.quarkus.logging.Log;
import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;

public class MilvusEmbeddingStore implements EmbeddingStore<TextSegment> {

    private final MilvusCollectionOperationsApi collectionOperations;

    private final MilvusVectorOperationsApi vectorOperations;
    private final LazyValue<Object> collectionExists;
    private final String dbName;
    private final String collectionName;
    private final MetricType metricType;
    private final String primaryField;
    private final String vectorField;

    public MilvusEmbeddingStore(boolean createCollection,
            String baseUrl,
            String authToken,
            Duration timeout,
            String dbName,
            String collectionName,
            Integer dimension,
            MetricType metricType,
            String primaryField,
            String vectorField) {
        this.dbName = dbName;
        this.collectionName = collectionName;
        this.metricType = metricType;
        this.primaryField = primaryField;
        this.vectorField = vectorField;
        try {
            ClientHeadersFactory clientHeadersFactory = new ClientHeadersFactory() {
                @Override
                public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incoming,
                        MultivaluedMap<String, String> outgoing) {
                    MultivaluedMap<String, String> headers = new MultivaluedHashMap<>();
                    if (authToken != null) {
                        headers.put("Authorization", singletonList("Bearer " + authToken));
                    }
                    return headers;
                }
            };
            collectionOperations = QuarkusRestClientBuilder.newBuilder()
                    .baseUri(new URI(baseUrl))
                    .followRedirects(true)
                    .connectTimeout(timeout.toSeconds(), TimeUnit.SECONDS)
                    .readTimeout(timeout.toSeconds(), TimeUnit.SECONDS)
                    .clientHeadersFactory(clientHeadersFactory)
                    .build(MilvusCollectionOperationsApi.class);
            vectorOperations = QuarkusRestClientBuilder.newBuilder()
                    .baseUri(new URI(baseUrl))
                    .followRedirects(true)
                    .connectTimeout(timeout.toSeconds(), TimeUnit.SECONDS)
                    .readTimeout(timeout.toSeconds(), TimeUnit.SECONDS)
                    .clientHeadersFactory(clientHeadersFactory)
                    .build(MilvusVectorOperationsApi.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        this.collectionExists = new LazyValue<>(new Supplier<Object>() {
            @Override
            public Object get() {
                if (collectionOperations.listCollections().getData().contains(collectionName)) {
                    Log.info("Milvus collection " + collectionName + " already exists");
                } else {
                    if (!createCollection) {
                        throw new IllegalArgumentException(
                                "quarkus.langchain4j.milvus.create-collection must be set to true when creating a new collection");
                    }
                    if (dimension == null) {
                        throw new IllegalArgumentException(
                                "quarkus.langchain4j.milvus.dimension must be specified when creating a new collecton");
                    }
                    collectionOperations.createCollecton(
                            new CreateCollectionRequest(dbName, collectionName, dimension, metricType, primaryField,
                                    vectorField));
                    Log.info("Created Milvus collection " + collectionName + " with dimension = " + dimension);
                }
                return new Object();
            }
        });
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
        // TODO
        String[] outputFields = { vectorField, primaryField };
        SearchRequest request = new SearchRequest(collectionName, embedding.vector(), maxResults, outputFields);
        SearchResponse response = vectorOperations.search(request);
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
        Log.debug("Adding embeddings: " + embeddings);
        int count = ids.size();
        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Map<String, Object> vector = new HashMap<>();
            vector.put(vectorField, embeddings.get(i).vector());
            vector.put(primaryField, ids.get(i));
            Map<String, String> metadataMap = textSegments.get(i).metadata().asMap();
            vector.putAll(metadataMap);
            data.add(vector);
        }
        UpsertRequest request = new UpsertRequest(collectionName, data);
        UpsertResponse response = vectorOperations.upsert(request);
        if (response.getCode() != 200) {
            throw new MilvusClientException("Failed to add embeddings: " + response.getMessage());
        }
        Log.debug("Added embeddings: " + response.getData().getUpsertCount());
    }
}
