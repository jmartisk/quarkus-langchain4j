package io.quarkiverse.langchain4j.runtime.devui.json;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.Content;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.ToolExecutionResultMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.memory.ChatMemory;

// The representation of a chat message that it sent to the Dev UI as JSON
public class ChatMessagePojo {

    private MessageType type;
    private String message;
    private String imageBase64;
    private List<ToolExecutionRequestPojo> toolExecutionRequests;
    private ToolExecutionResultPojo toolExecutionResult;

    public MessageType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public List<ToolExecutionRequestPojo> getToolExecutionRequests() {
        return toolExecutionRequests;
    }

    public ToolExecutionResultPojo getToolExecutionResult() {
        return toolExecutionResult;
    }

    public UserMessage toUserMessage() {
        List<Content> contents = new ArrayList<>();
        if (this.getImageBase64() != null && !this.getImageBase64().isEmpty()) {
            // TODO: detect mime type
            contents.add(ImageContent.from(this.getImageBase64(), "image/png"));
        }
        if (this.getMessage() != null && !this.getMessage().isEmpty()) {
            contents.add(new TextContent(this.getMessage()));
        }
        return new UserMessage(contents);
    }

    public static List<ChatMessagePojo> listFromMemory(ChatMemory memory) {
        return memory.messages()
                .stream()
                .map(ChatMessagePojo::fromMessage)
                .collect(Collectors.toList());
    }

    public static ChatMessagePojo fromMessage(ChatMessage message) {
        ChatMessagePojo json = new ChatMessagePojo();
        switch (message.type()) {
            case SYSTEM:
                json.type = MessageType.SYSTEM;
                json.message = ((SystemMessage) message).text();
                break;
            case USER:
                json.type = MessageType.USER;
                for (Content content : ((UserMessage) message).contents()) {
                    if (content instanceof ImageContent) {
                        json.imageBase64 = ((ImageContent) content).image().base64Data();
                    } else if (content instanceof TextContent) {
                        json.message = ((TextContent) content).text();
                    }
                }
                break;
            case AI:
                AiMessage aiMessage = (AiMessage) message;
                json.type = MessageType.AI;
                json.message = ((AiMessage) message).text();
                if (aiMessage.toolExecutionRequests() != null && !aiMessage.toolExecutionRequests().isEmpty()) {
                    json.toolExecutionRequests = ((AiMessage) message)
                            .toolExecutionRequests().stream()
                            .map(r -> new ToolExecutionRequestPojo(r.id(), r.name(), r.arguments()))
                            .collect(Collectors.toList());
                }
                break;
            case TOOL_EXECUTION_RESULT:
                json.type = MessageType.TOOL_EXECUTION_RESULT;
                json.message = null;
                json.toolExecutionResult = new ToolExecutionResultPojo(
                        ((ToolExecutionResultMessage) message).id(),
                        ((ToolExecutionResultMessage) message).toolName(),
                        ((ToolExecutionResultMessage) message).text());
                break;
        }
        return json;
    }

}
