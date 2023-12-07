package io.quarkiverse.langchain4j.pinecone;

import java.util.Collections;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.ClassType;
import org.jboss.jandex.DotName;
import org.jboss.jandex.ParameterizedType;

import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStore;
import io.milvus.grpc.MilvusService;
import io.milvus.grpc.MilvusServiceClient;
import io.quarkiverse.langchain4j.deployment.EmbeddingStoreBuildItem;
import io.quarkiverse.langchain4j.milvus.MilvusEmbeddingStore;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusRecorder;
import io.quarkiverse.langchain4j.milvus.runtime.MilvusRuntimeConfig;
import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.grpc.deployment.GrpcClientBuildItem;

public class MilvusProcessor {

    public static final DotName MILVUS_EMBEDDING_STORE = DotName
            .createSimple(MilvusEmbeddingStore.class);
    private static final String FEATURE = "langchain4j-milvus";

    public static final DotName MILVUS_SERVICE_CLIENT = DotName.createSimple(MilvusServiceClient.class);
    public static final DotName MILVUS_SERVICE = DotName.createSimple(MilvusService.class);

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public GrpcClientBuildItem createGrpcClient() {
        GrpcClientBuildItem client = new GrpcClientBuildItem("milvus");
        GrpcClientBuildItem.ClientInfo info = new GrpcClientBuildItem.ClientInfo(MILVUS_SERVICE,
                GrpcClientBuildItem.ClientType.MUTINY_CLIENT,
                MILVUS_SERVICE_CLIENT,
                Collections.emptySet());
        client.addClient(info);
        return client;
    }

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    public void createBean(
            BuildProducer<SyntheticBeanBuildItem> beanProducer,
            MilvusRecorder recorder,
            MilvusRuntimeConfig config,
            BuildProducer<EmbeddingStoreBuildItem> embeddingStoreProducer) {
        beanProducer.produce(SyntheticBeanBuildItem
                .configure(MILVUS_EMBEDDING_STORE)
                .types(ClassType.create(EmbeddingStore.class),
                        ParameterizedType.create(EmbeddingStore.class, ClassType.create(TextSegment.class)))
                .defaultBean()
                .setRuntimeInit()
                .defaultBean()
                .scope(ApplicationScoped.class)
                .addInjectionPoint(ClassType.create(MILVUS_SERVICE),
                        AnnotationInstance.builder(GrpcClient.class).value("milvus").build())
                .createWith(recorder.createMilvusEmbeddingStore(config))
                .done());
        embeddingStoreProducer.produce(new EmbeddingStoreBuildItem());
    }

}
