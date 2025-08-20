package com.hayden.testmcpserver.config;

import com.hayden.testmcpserver.tools.TestMcpTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestToolsConfig {

    @Bean
    public ToolCallbackProvider toolCallbackProvider(TestMcpTools tools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(tools)
                .build();
    }

}
