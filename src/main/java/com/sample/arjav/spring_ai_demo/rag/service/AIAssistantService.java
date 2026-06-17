package com.sample.arjav.spring_ai_demo.rag.service;

import com.sample.arjav.spring_ai_demo.api.dto.CarResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIAssistantService {

  private final ChatClient chatClient;

  public AIAssistantService(ChatClient chatClient) {
    this.chatClient = chatClient;
  }

  public String getDreamCar(String query) {
    return chatClient.prompt(query).call().content();
  }

  public CarResponse getDreamCarData(String query) {
    return chatClient.prompt(query).call().entity(CarResponse.class);
  }
}

