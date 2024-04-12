package io.quarkiverse.langchain4j.runtime.devui.json;

public class MessageContent {

    private MessageContentType type;

    // applicable when type=TEXT
    private String text;

    // applicable when type=IMAGE (generally, one of these will be non-null)
    private String url;
    private String base64Data;

    public MessageContentType getType() {
        return type;
    }

    public void setType(MessageContentType type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBase64Data() {
        return base64Data;
    }

    public void setBase64Data(String base64Data) {
        this.base64Data = base64Data;
    }
}
