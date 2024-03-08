package io.quarkiverse.langchain4j.elasticsearch;

import static io.quarkus.runtime.annotations.ConfigPhase.RUN_TIME;

import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot(phase = RUN_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.elasticsearch")
public interface ElasticsearchRuntimeConfig {

    /**
     * Name of the Elasticsearch index to be used.
     * This has to be the same as the dimension of vectors produced by
     * the embedding model that you use. For example, AllMiniLmL6V2QuantizedEmbeddingModel produces vectors of dimension 384.
     * OpenAI's text-embedding-ada-002 produces vectors of dimension 1536.
     */
    @WithDefault("embeddings")
    String indexName();

    /**
     * Dimension of the embeddings.
     */
    Integer dimension();

}
