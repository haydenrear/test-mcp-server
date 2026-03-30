package com.hayden.testmcpserver.tools;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class TestMcpTools {

    @Tool(description = "Some tool")
    @McpTool(description = "Some tool")
    public String doSomething(@ToolParam @McpToolParam String aTool) {
        return "did something!";
    }

}
