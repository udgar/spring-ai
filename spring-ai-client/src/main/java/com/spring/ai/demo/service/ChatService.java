package com.spring.ai.demo.service;

import com.spring.ai.demo.models.WorkoutChatResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.metadata.Usage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;


@Service
public class ChatService {

    private Logger LOGGER = LoggerFactory.getLogger(ChatService.class);

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

    public ChatResponse joke() {
        return chatClient.prompt().user("Tell me a joke").call().chatResponse();
    }

    public WorkoutChatResponse getWorkoutPlan(String type) {
        return chatClient.prompt()
                .system("Provide only the list of three")
                .user(String.format("Give me the list of  %s exercises", type))
                .call()
                .entity(WorkoutChatResponse.class);
    }

    public Flux<String> messageExplanation(String message) {
        return chatClient.prompt()
                .system("Explain the type of financial message in a sentence or two(make it short and sweet), please give a valid error if it is not a financial message and if message format is not good give reasons")
                .user(message)
                .options(ChatOptions.builder().temperature(0.5).build())
                .stream()
                .chatResponse()
                .doOnNext(response -> {
                    Usage usage = response.getMetadata().getUsage();
                    if (usage != null && usage.getTotalTokens() != null && usage.getTotalTokens() != 0)
                        LOGGER.info("Prompt tokens is {} and completion token is {}, total {}",
                                usage.getPromptTokens(),
                                usage.getCompletionTokens(),
                                usage.getTotalTokens());
                })
                .onErrorComplete()
                .map(chatResponse -> chatResponse.getResult().getOutput().getText());

    }

}
