package com.spring.ai.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChatService {


    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder builder) {
        this.chatClient = builder.defaultOptions(ChatOptions.builder().model("mistral-small-2603").build()).build();
    }

    public Flux<String> ask() {
        return chatClient.prompt().user("Say hello").stream().content();
    }

    public Flux<String> streamChat(String prompt) {
        return chatClient.prompt().user(prompt).stream().content();
    }

    public ChatResponse joke(){
        return chatClient.prompt().user("Tell me a joke").call().chatResponse();
    }

}
