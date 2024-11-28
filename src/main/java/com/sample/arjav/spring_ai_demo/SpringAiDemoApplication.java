package com.sample.arjav.spring_ai_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringAiDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAiDemoApplication.class, args);
  }
}
