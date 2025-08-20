package com.hayden.testmcpserver.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class TestMcpTools {

    @Tool(description = "Some tool")
    public String doSomething(@ToolParam String aTool) {
        return "did something!";
    }

}
