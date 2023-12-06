package io.quarkiverse.langchain4j.milvus.runtime;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UpsertResponse {

    private int code;
    private UpsertData data;

    private String message;

    @JsonCreator
    public UpsertResponse(int code, UpsertData data, String message) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public UpsertData getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
