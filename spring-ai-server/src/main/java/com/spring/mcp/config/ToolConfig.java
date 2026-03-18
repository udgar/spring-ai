package com.spring.mcp.config;

import com.spring.mcp.tools.FlightInformationTools;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ToolConfig {

    @Bean
    public MethodToolCallbackProvider tools(FlightInformationTools flightTools) {
        return MethodToolCallbackProvider.builder().toolObjects(
                flightTools
        ).build();
    }
}
