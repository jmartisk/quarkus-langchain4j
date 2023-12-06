package io.quarkiverse.langchain4j.milvus.runtime;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CreateCollectionResponse {

    private int code;
    private String message;

    @JsonCreator
    public CreateCollectionResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
