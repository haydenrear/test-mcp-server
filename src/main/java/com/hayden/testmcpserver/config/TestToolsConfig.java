package com.hayden.testmcpserver.config;

import com.hayden.testmcpserver.tools.TestMcpTools;
import com.hayden.testmcpserver.tools.TestMcpTools2;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestToolsConfig {



    @Bean
    public ToolCallbackProvider toolCallbackProvider(TestMcpTools tools, TestMcpTools2 tools2,
                                                     TestMcpServerConfigProps configProps) {

        if (configProps.enableMcpTestTools && configProps.enableMcpTestTools2) {
            return MethodToolCallbackProvider.builder()
                    .toolObjects(tools, tools2)
                    .build();
        }
        if (configProps.enableMcpTestTools2) {
            return MethodToolCallbackProvider.builder()
                    .toolObjects(tools2)
                    .build();
        }
        if (configProps.enableMcpTestTools) {
            return MethodToolCallbackProvider.builder()
                    .toolObjects(tools2)
                    .build();
        }

        return MethodToolCallbackProvider.builder()
                .toolObjects()
                .build();

    }

}
