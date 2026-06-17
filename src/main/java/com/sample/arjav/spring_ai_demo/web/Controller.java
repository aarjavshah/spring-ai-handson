package com.sample.arjav.spring_ai_demo.web;

import com.sample.arjav.spring_ai_demo.api.dto.CarResponse;
import com.sample.arjav.spring_ai_demo.application.service.CarService;
import com.sample.arjav.spring_ai_demo.application.service.ProductRecommendationService;
import com.sample.arjav.spring_ai_demo.domain.entity.Car;
import com.sample.arjav.spring_ai_demo.rag.service.AIAssistantService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final ProductRecommendationService productRecommendationService;
  private final AIAssistantService aiAssistantService;
  private final CarService carService;

  public Controller(
      ProductRecommendationService productRecommendationService,
      AIAssistantService aiAssistantService,
      CarService carService) {
    this.productRecommendationService = productRecommendationService;
    this.aiAssistantService = aiAssistantService;
    this.carService = carService;
  }

  @GetMapping("/cars")
  List<Car> getCars(@RequestParam("id") String carId) {
    return carService.getCars(carId);
  }

  @GetMapping("/product-recommendations")
  String getProductRecommendations(@RequestParam("searchString") String searchString) {
    return productRecommendationService.generateRecommendations(searchString);
  }

  @GetMapping("/car-recommendations")
  String findTheDreamCar(@RequestParam("query") String query) {
    return aiAssistantService.getDreamCar(query);
  }

  @GetMapping("/car-suggestions")
  CarResponse findTheDreamCarObject(@RequestParam("query") String query) {
    return aiAssistantService.getDreamCarData(query);
  }
}

