package io.quarkiverse.langchain4j.elasticsearch;

import java.util.function.Function;

import org.elasticsearch.client.RestClient;

import dev.langchain4j.store.embedding.elasticsearch.ElasticsearchEmbeddingStore;
import io.quarkus.arc.SyntheticCreationalContext;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class ElasticsearchRecorder {

    public Function<SyntheticCreationalContext<ElasticsearchEmbeddingStore>, ElasticsearchEmbeddingStore> embeddingStoreFunction(
            ElasticsearchRuntimeConfig config) {
        return new Function<>() {
            @Override
            public ElasticsearchEmbeddingStore apply(SyntheticCreationalContext<ElasticsearchEmbeddingStore> context) {
                RestClient client = context.getInjectedReference(RestClient.class);
                return new ElasticsearchEmbeddingStore(client, config.indexName(), config.dimension());
            }
        };
    }

}
