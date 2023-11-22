package io.quarkiverse.langchain4j.pinecone;

import java.util.List;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingMatch;
import dev.langchain4j.store.embedding.EmbeddingStore;
import io.pinecone.proto.VectorService;

public class PineconeEmbeddingStore implements EmbeddingStore<TextSegment> {

    private final VectorService vectorService;

    public PineconeEmbeddingStore(VectorService vectorService) {
        this.vectorService = vectorService;
        // FIXME REMOVE
        System.out.println("PineconeEmbeddingStore constructor; vectorService = " + vectorService);
    }

    @Override
    public String add(Embedding embedding) {
        return null;
    }

    @Override
    public void add(String s, Embedding embedding) {

    }

    @Override
    public String add(Embedding embedding, TextSegment textSegment) {
        return null;
    }

    @Override
    public List<String> addAll(List<Embedding> list) {
        return null;
    }

    @Override
    public List<String> addAll(List<Embedding> list, List<TextSegment> list1) {
        return null;
    }

    @Override
    public List<EmbeddingMatch<TextSegment>> findRelevant(Embedding embedding, int i, double v) {
        return null;
    }
}
