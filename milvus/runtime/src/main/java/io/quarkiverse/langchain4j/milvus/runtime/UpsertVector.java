package io.quarkiverse.langchain4j.milvus.runtime;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UpsertVector {

    private float[] vector;

    private String title;

    public UpsertVector() {
    }

}
