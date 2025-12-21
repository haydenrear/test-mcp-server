package com.hayden.testmcpserver.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class TestMcpTools2 {

    @Tool(description = "Some tool again")
    public String doSomethingAgain(@ToolParam String aTool) {
        return "did something!";
    }

}
