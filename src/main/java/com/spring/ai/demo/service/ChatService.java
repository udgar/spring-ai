package com.spring.ai.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChatService {


    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public Flux<String> askGemini() {
        return chatClient.prompt().user("Tell me about yourself").stream().content();
    }

    public Flux<String> streamChat(String prompt) {
        return chatClient.prompt().user(prompt).stream().content();
    }

}
