package io.quarkiverse.langchain4j.pinecone.runtime;

import java.util.function.Function;

import io.pinecone.proto.VectorService;
import io.quarkiverse.langchain4j.pinecone.PineconeEmbeddingStore;
import io.quarkus.arc.SyntheticCreationalContext;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class PineconeRecorder {

    public Function<SyntheticCreationalContext<PineconeEmbeddingStore>, PineconeEmbeddingStore> embeddingStoreFunction(
            PineconeEmbeddingStoreConfig config) {
        return new Function<>() {
            @Override
            public PineconeEmbeddingStore apply(SyntheticCreationalContext<PineconeEmbeddingStore> context) {
                VectorService vectorService = context.getInjectedReference(VectorService.class,
                        GrpcClient.Literal.of("pinecone"));
                PineconeEmbeddingStore store = new PineconeEmbeddingStore(vectorService);
                return store;
            }
        };

    }
}
