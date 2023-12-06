package io.quarkiverse.langchain4j.milvus.runtime;

import java.time.Duration;
import java.util.function.Supplier;

import io.quarkiverse.langchain4j.milvus.MilvusEmbeddingStore;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class MilvusRecorder {

    public Supplier<MilvusEmbeddingStore> milvusStoreSupplier(MilvusRuntimeConfig config) {
        return new Supplier<>() {
            @Override
            public MilvusEmbeddingStore get() {
                return new MilvusEmbeddingStore(
                        config.createCollection(),
                        config.baseUrl(),
                        config.token().orElse(null),
                        config.timeout().orElse(Duration.ofSeconds(5)),
                        config.dbName(),
                        config.collectionName(),
                        config.dimension().orElse(null),
                        config.metricType(),
                        config.primaryField(),
                        config.vectorField());
            }
        };
    }
}
