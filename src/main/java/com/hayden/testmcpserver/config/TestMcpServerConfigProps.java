package com.hayden.testmcpserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "configs")
@Component
@Data
public class TestMcpServerConfigProps {

    boolean enableMcpTestTools;

    boolean enableMcpTestTools2;

}
