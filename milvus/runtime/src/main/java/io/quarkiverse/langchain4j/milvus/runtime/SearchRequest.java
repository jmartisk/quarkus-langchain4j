package io.quarkiverse.langchain4j.milvus.runtime;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SearchRequest {

    private String collectionName;

    private float[] vector;

    private int limit;

    private String[] outputFields;

    public SearchRequest(String collectionName, float[] vector, int limit, String[] outputFields) {
        this.collectionName = collectionName;
        this.vector = vector;
        this.limit = limit;
        this.outputFields = outputFields;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public float[] getVector() {
        return vector;
    }

    public int getLimit() {
        return limit;
    }

    public String[] getOutputFields() {
        return outputFields;
    }
}