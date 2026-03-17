package com.spring.mcp.config;

import com.spring.mcp.tools.ServerTools;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {

    @Bean
    public MethodToolCallbackProvider tools(ServerTools tools) {
        return MethodToolCallbackProvider.builder().toolObjects(
                tools
        ).build();
    }
}
