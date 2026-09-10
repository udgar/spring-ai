package com.spring.ai.demo.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class SupportDecider {

    @Tool(description = "Determine whether this type of message is supported by system")
    public String isSupported(@ToolParam(description = "The SWIFT message type Eg: MT101,pacs008") String messageType) {
        return switch (messageType) {
            case "mt101" -> "SUPPORTED";
            case "mt103" -> "PARTIALLY_SUPPORTED";
            case "pacs008" -> "NOT_SUPPORTED(MX_MESSAGE)";
            default -> "NOT_IDENTIFIED";
        };
    }
}
