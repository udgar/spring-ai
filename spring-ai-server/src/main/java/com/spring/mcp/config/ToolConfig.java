package com.spring.mcp.config;

import com.spring.mcp.tools.BookingTools;
import com.spring.mcp.tools.FlightInformationTools;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {

    @Bean
    public MethodToolCallbackProvider tools(FlightInformationTools flightTools, BookingTools bookingTools) {
        return MethodToolCallbackProvider.builder().toolObjects(
                flightTools,
                bookingTools
        ).build();
    }
}
