package io.steviemul.mcp.client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

  private final ChatClient chatClient;

  public String getAnswer(String question) {

    PromptTemplate promptTemplate = new PromptTemplate(question);

    return chatClient.prompt(promptTemplate.create())
        .call()
        .content();
  }
}
