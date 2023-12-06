package io.quarkiverse.langchain4j.milvus.runtime;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UpsertData {

    private int upsertCount;
    private List<String> upsertIds;

    @JsonCreator
    public UpsertData(int upsertCount, List<String> upsertIds) {
        this.upsertCount = upsertCount;
        this.upsertIds = upsertIds;
    }

    public int getUpsertCount() {
        return upsertCount;
    }

    public List<String> getUpsertIds() {
        return upsertIds;
    }
}
