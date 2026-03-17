package com.spring.mcp.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class ServerTools {

    // name and description , description is required in order to set what the AI uses
    @Tool(name = "rajnikatninath-mulakami-latest-resume", description = "Tell me about Rajnikatninath Mulakami latest experiences")
    public String getLatestInformation() {
        return """
                He has recently started working as a JAVA developer at a big software company called AI Nice Labs.
                """;
    }
    // If we gave this to LLMs they can use this in oder to fine tune their model to give this information.
}
