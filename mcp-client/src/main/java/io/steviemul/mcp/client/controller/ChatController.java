package io.steviemul.mcp.client.controller;

import io.steviemul.mcp.client.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

  private final ChatService chatService;

  @GetMapping("/answer")
  public String getAnswer(@RequestParam("q") String question) {
    return chatService.getAnswer(question);
  }
}
