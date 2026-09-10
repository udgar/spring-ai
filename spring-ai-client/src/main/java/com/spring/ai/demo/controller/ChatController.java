package com.spring.ai.demo.controller;

import com.spring.ai.demo.models.WorkoutChatResponse;
import com.spring.ai.demo.service.ChatService;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/client")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping(value = "/chat")
    public Flux<String> chat() {
        return service.ask();
    }

    @PostMapping(value = "/stream")
    public Flux<String> streamChat(@RequestBody String prompt) {
        return service.streamChat(prompt);
    }

    @GetMapping(value = "/joke")
    public ChatResponse joke() {
        return service.joke();
    }

    @GetMapping(value = "/workout/{type}")
    public WorkoutChatResponse workouts(@PathVariable String type) {
        return service.getWorkoutPlan(type != null ? type : "pull");
    }

    @PostMapping(value = "/financial-message")
    public Flux<String> financialMessage(@RequestBody String requestBody) {
        return service.messageExplanation(requestBody);
    }

    @GetMapping(value = "/supported-message")
    public Flux<String> isSupported(@RequestBody String message) {
        return service.supportedMessageType(message);
    }

}
