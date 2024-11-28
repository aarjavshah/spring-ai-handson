package com.sample.arjav.spring_ai_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AIAssistantService {

  private final ChatClient chatClient;

  public String getDreamCar(String query) {
    return chatClient.prompt(query).call().content();
  }

  public CarResponse getDreamCarData(String query) {
    return chatClient.prompt(query).call().entity(CarResponse.class);
  }
}
