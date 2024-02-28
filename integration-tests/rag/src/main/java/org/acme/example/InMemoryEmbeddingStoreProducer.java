package org.acme.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;

public class InMemoryEmbeddingStoreProducer {

    @Produces
    @ApplicationScoped
    public InMemoryEmbeddingStore<TextSegment> store = new InMemoryEmbeddingStore<>();
}
