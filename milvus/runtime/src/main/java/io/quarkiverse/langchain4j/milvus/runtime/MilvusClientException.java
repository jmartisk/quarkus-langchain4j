package io.quarkiverse.langchain4j.milvus.runtime;

public class MilvusClientException extends RuntimeException {

    public MilvusClientException(String message) {
        super(message);
    }

    public MilvusClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
