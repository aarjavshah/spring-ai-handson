package com.sample.arjav.spring_ai_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductRecommendationService {

  private final MistralAiChatModel chatModel;

  public String generateRecommendations(String searchString) {

    return chatModel.call(new Prompt(searchString)).toString();
  }
}
