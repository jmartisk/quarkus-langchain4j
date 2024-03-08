package io.quarkiverse.langchain4j.deployment;

import jakarta.enterprise.context.ApplicationScoped;

import org.elasticsearch.client.RestClient;
import org.jboss.jandex.ClassType;
import org.jboss.jandex.DotName;
import org.jboss.jandex.ParameterizedType;

import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.elasticsearch.ElasticsearchEmbeddingStore;
import io.quarkiverse.langchain4j.elasticsearch.ElasticsearchRecorder;
import io.quarkiverse.langchain4j.elasticsearch.ElasticsearchRuntimeConfig;
import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class ElasticsearchEmbeddingStoreProcessor {

    public static final DotName ELASTICSEARCH_EMBEDDING_STORE = DotName.createSimple(ElasticsearchEmbeddingStore.class);

    private static final String FEATURE = "langchain4j-elasticsearch";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    public void createBean(
            BuildProducer<SyntheticBeanBuildItem> beanProducer,
            ElasticsearchRecorder recorder,
            ElasticsearchRuntimeConfig config,
            BuildProducer<EmbeddingStoreBuildItem> embeddingStoreProducer) {
        beanProducer.produce(SyntheticBeanBuildItem
                .configure(ELASTICSEARCH_EMBEDDING_STORE)
                .types(ClassType.create(EmbeddingStore.class),
                        ParameterizedType.create(EmbeddingStore.class, ClassType.create(TextSegment.class)))
                .setRuntimeInit()
                .defaultBean()
                .scope(ApplicationScoped.class)
                .addInjectionPoint(ClassType.create(DotName.createSimple(RestClient.class)))
                .createWith(recorder.embeddingStoreFunction(config))
                .done());
        embeddingStoreProducer.produce(new EmbeddingStoreBuildItem());
    }

}
