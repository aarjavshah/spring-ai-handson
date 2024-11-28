package com.sample.arjav.spring_ai_demo.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

  @Bean
  ChatClient chatClient(VectorStore vs, ChatClient.Builder builder) {
    var system =
        """
                You are an AI powered assistant to help people find a car of their dreams from CarSpring.com
                with locations in Utrecht, Netherlands, and Amsterdam, Netherlands. If you don't know about the cars
                available at our particular stores, then return a disappointed response suggesting we don't have anything.
                """;
    return builder
        .defaultSystem(system)
        .defaultAdvisors(new QuestionAnswerAdvisor(vs, SearchRequest.defaults()))
        .build();
  }
}
