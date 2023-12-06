package io.quarkiverse.langchain4j.milvus.runtime;

import java.util.List;
import java.util.Map;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UpsertRequest {

    private String collectionName;

    private List<Map<String, Object>> data;

    public UpsertRequest(String collectionName, List<Map<String, Object>> data) {
        this.collectionName = collectionName;
        this.data = data;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }
}
