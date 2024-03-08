package io.quarkiverse.langchain4j.deployment;

import java.io.IOException;

import jakarta.inject.Inject;

import org.elasticsearch.client.RestClient;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.extension.RegisterExtension;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRequest;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.embedding.AllMiniLmL6V2QuantizedEmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.EmbeddingStoreIT;
import io.quarkus.test.QuarkusUnitTest;

class ElasticsearchEmbeddingStoreTest extends EmbeddingStoreIT {

    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
                    .addAsResource(new StringAsset("quarkus.langchain4j.elasticsearch.dimension=384"),
                            "application.properties"));

    @Inject
    EmbeddingStore<TextSegment> embeddingStore;

    @Inject
    RestClient client;

    EmbeddingModel embeddingModel = new AllMiniLmL6V2QuantizedEmbeddingModel();

    @Override
    protected EmbeddingStore<TextSegment> embeddingStore() {
        return embeddingStore;
    }

    @Override
    protected EmbeddingModel embeddingModel() {
        return embeddingModel;
    }

    @Override
    protected void ensureStoreIsEmpty() {
        ElasticsearchTransport transport = new RestClientTransport(client, new JacksonJsonpMapper());
        ElasticsearchClient eClient = new ElasticsearchClient(transport);
        Query query = co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders.matchAll().build()._toQuery();
        DeleteByQueryRequest request = new DeleteByQueryRequest.Builder()
                .index("embeddings")
                .query(query).build();
        try {
            var result = eClient.deleteByQuery(request).deleted();
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void clearIndex(ElasticsearchClient client, String index) {

    }

    @Override
    protected void awaitUntilPersisted() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
