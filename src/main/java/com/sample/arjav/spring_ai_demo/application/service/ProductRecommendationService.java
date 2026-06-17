package com.sample.arjav.spring_ai_demo.application.service;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class ProductRecommendationService {

  private final MistralAiChatModel chatModel;

  public ProductRecommendationService(MistralAiChatModel chatModel) {
    this.chatModel = chatModel;
  }

  public String generateRecommendations(String searchString) {

    return chatModel.call(new Prompt(searchString)).toString();
  }
}

