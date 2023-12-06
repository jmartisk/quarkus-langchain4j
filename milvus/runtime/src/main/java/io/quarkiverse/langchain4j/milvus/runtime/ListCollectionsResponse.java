package io.quarkiverse.langchain4j.milvus.runtime;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ListCollectionsResponse {

    private int code;
    private List<String> data;

    @JsonCreator
    public ListCollectionsResponse(int code, List<String> data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public List<String> getData() {
        return data;
    }
}
