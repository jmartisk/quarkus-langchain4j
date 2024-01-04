package io.quarkiverse.langchain4j.runtime.devui;

import jakarta.inject.Inject;

import dev.langchain4j.data.image.Image;
import dev.langchain4j.model.image.ImageModel;
import io.vertx.core.json.JsonObject;

public class ImagesJsonRPCService {

    @Inject
    ImageModel model;

    public JsonObject generate(String prompt) {
        Image image = model.generate(prompt).content();
        JsonObject result = new JsonObject();
        result.put("prompt", prompt);
        if (image.url() != null) {
            result.put("url", image.url().toString());
        } else {
            result.put("url", null);
        }
        if (image.base64Data() != null && !image.base64Data().isEmpty()) {
            result.put("base64Data", image.base64Data());
        } else {
            result.put("base64Data", null);
        }
        return result;
    }

}
