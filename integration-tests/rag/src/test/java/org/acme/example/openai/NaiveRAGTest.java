package org.acme.example.openai;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import jakarta.inject.Inject;

import org.acme.example.AiServiceWithNaiveRag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import dev.langchain4j.data.document.Metadata;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class NaiveRAGTest {

    @Inject
    AiServiceWithNaiveRag service;

    @Inject
    InMemoryEmbeddingStore<TextSegment> store;

    @Inject
    EmbeddingModel embeddingModel;

    private static AtomicReference<List<ChatMessage>> lastQuery = new AtomicReference<>();

    @BeforeAll
    public static void initializeModel() {
        ChatLanguageModel mock = Mockito.mock(ChatLanguageModel.class);
        Answer<Object> answer = invocation -> {
            lastQuery.set(invocation.getArgument(0));
            return new Response<>(new AiMessage("Mock response"));
        };
        Mockito.when(mock.generate(Mockito.anyList())).thenAnswer(answer);
        Mockito.when(mock.generate(Mockito.anyList(), Mockito.anyList())).thenAnswer(answer);
        QuarkusMock.installMockForType(mock, ChatLanguageModel.class);
    }

    @Test
    public void test() {
        embed("Charlie was born in 2018.");
        embed("David was born in 2019.");
        service.chat("When was Charlie born?");
        List<ChatMessage> query = lastQuery.get();
        Assertions.assertTrue(query.get(0).text().contains("Charlie was born in 2018."));
    }

    private void embed(String text) {
        store.add(embeddingModel.embed(text).content(), new TextSegment(text, new Metadata()));
    }
}
