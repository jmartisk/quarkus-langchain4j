package io.quarkiverse.langchain4j.milvus.runtime;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SearchResponse {

    private int code;

    private SearchResultData data;

    @JsonCreator
    public SearchResponse(int code, SearchResultData data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
