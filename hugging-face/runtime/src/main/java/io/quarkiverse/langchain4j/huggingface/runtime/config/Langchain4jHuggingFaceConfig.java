package io.quarkiverse.langchain4j.huggingface.runtime.config;

import static io.quarkus.runtime.annotations.ConfigPhase.RUN_TIME;

import java.time.Duration;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot(phase = RUN_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.huggingface")
public interface Langchain4jHuggingFaceConfig {

    /**
     * HuggingFace API key
     */
    Optional<String> apiKey();

    /**
     * Timeout for HuggingFace calls
     */
    @WithDefault("10s")
    Duration timeout();

    /**
     * Chat model related settings
     */
    ChatModelConfig chatModel();

    /**
     * Embedding model related settings
     */
    EmbeddingModelConfig embeddingModel();

    /**
     * Whether the OpenAI client should log requests
     */
    @WithDefault("false")
    Boolean logRequests();

    /**
     * Whether the OpenAI client should log responses
     */
    @WithDefault("false")
    Boolean logResponses();
}
