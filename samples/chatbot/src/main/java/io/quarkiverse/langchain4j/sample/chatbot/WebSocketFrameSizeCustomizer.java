package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.enterprise.context.Dependent;

import io.quarkus.vertx.http.HttpServerOptionsCustomizer;
import io.vertx.core.http.HttpServerOptions;

@Dependent
public class WebSocketFrameSizeCustomizer implements HttpServerOptionsCustomizer {

    @Override
    public void customizeHttpServer(HttpServerOptions options) {
        System.out.println("CUSTOMIZING!");
        options.setMaxWebSocketFrameSize(999999999);
    }
}
