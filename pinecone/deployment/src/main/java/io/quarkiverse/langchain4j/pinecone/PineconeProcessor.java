package io.quarkiverse.langchain4j.pinecone;

import java.util.Collections;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.ClassType;
import org.jboss.jandex.DotName;

import dev.langchain4j.store.embedding.EmbeddingStore;
import io.pinecone.proto.VectorService;
import io.pinecone.proto.VectorServiceClient;
import io.quarkiverse.langchain4j.pinecone.runtime.PineconeEmbeddingStoreConfig;
import io.quarkiverse.langchain4j.pinecone.runtime.PineconeRecorder;
import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.grpc.deployment.GrpcClientBuildItem;

public class PineconeProcessor {

    public static final DotName PINECONE_EMBEDDING_STORE = DotName.createSimple(PineconeEmbeddingStore.class);
    public static final DotName VECTOR_SERVICE = DotName.createSimple(VectorService.class);
    public static final DotName VECTOR_SERVICE_IMPL = DotName.createSimple(VectorServiceClient.class);
    private static final String FEATURE = "langchain4j-pinecone";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public GrpcClientBuildItem createGrpcClient() {
        GrpcClientBuildItem client = new GrpcClientBuildItem("pinecone");
        GrpcClientBuildItem.ClientInfo info = new GrpcClientBuildItem.ClientInfo(VECTOR_SERVICE,
                GrpcClientBuildItem.ClientType.MUTINY_CLIENT,
                VECTOR_SERVICE_IMPL,
                Collections.emptySet());
        client.addClient(info);
        return client;
    }

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    public void createBean(
            BuildProducer<SyntheticBeanBuildItem> beanProducer,
            PineconeRecorder recorder,
            PineconeEmbeddingStoreConfig config) {
        beanProducer.produce(SyntheticBeanBuildItem
                .configure(PINECONE_EMBEDDING_STORE)
                .types(EmbeddingStore.class)
                .setRuntimeInit()
                .defaultBean()
                .scope(ApplicationScoped.class)
                .addInjectionPoint(ClassType.create(VECTOR_SERVICE),
                        AnnotationInstance.builder(GrpcClient.class).value("pinecone").build())
                .createWith(recorder.embeddingStoreFunction(config))
                .done());

    }
}
