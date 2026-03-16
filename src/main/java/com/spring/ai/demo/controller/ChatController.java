package com.spring.ai.demo.controller;

import com.spring.ai.demo.service.ChatService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Controller
@RequestMapping("/api/v1/client")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping(value = "/chat")
    public Flux<String> chat() {
        return service.askGemini();
    }

    @PostMapping(value = "/stream")
    public Flux<String> streamChat(@RequestBody String prompt){
        return service.streamChat(prompt);
    }

}
