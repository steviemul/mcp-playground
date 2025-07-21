package io.steviemul.mcp.server.config;

import io.steviemul.mcp.server.service.ToolsService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolsConfig {

  @Bean
  public ToolCallbackProvider toolCallbackProvider(ToolsService toolsService) {
    return MethodToolCallbackProvider.builder()
        .toolObjects(toolsService)
        .build();
  }
}
