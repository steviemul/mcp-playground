package io.steviemul.mcp.server.service;

import java.util.List;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class ToolsService {

  @Tool(name = "Search for items by status", description = "Find all items by status")
  public List<String> getItemsByStatus(
      @ToolParam(description = "Item Status") String status) {

    return List.of("First Item", "Second Item", "Third Item");
  }
}
