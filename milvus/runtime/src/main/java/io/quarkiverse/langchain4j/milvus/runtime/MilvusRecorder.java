package io.quarkiverse.langchain4j.milvus.runtime;

import java.time.Duration;
import java.util.function.Function;

import io.milvus.grpc.MilvusService;
import io.quarkiverse.langchain4j.milvus.MilvusEmbeddingStore;
import io.quarkus.arc.SyntheticCreationalContext;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class MilvusRecorder {

    public Function<SyntheticCreationalContext<MilvusEmbeddingStore>, MilvusEmbeddingStore> createMilvusEmbeddingStore(
            MilvusRuntimeConfig config) {
        return new Function<>() {
            @Override
            public MilvusEmbeddingStore apply(SyntheticCreationalContext<MilvusEmbeddingStore> context) {
                MilvusService client = context.getInjectedReference(MilvusService.class,
                        GrpcClient.Literal.of("milvus"));
                return new MilvusEmbeddingStore(
                        config.createCollection(),
                        client,
                        config.token().orElse(null),
                        config.timeout().orElse(Duration.ofSeconds(5)),
                        config.dbName(),
                        config.collectionName(),
                        config.dimension().orElse(null),
                        config.metricType(),
                        config.idField(),
                        config.vectorField(),
                        config.textField());
            }
        };
    }

}
