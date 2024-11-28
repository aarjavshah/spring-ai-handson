package com.sample.arjav.spring_ai_demo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final ProductRecommendationService productRecommendationService;
  private final AIAssistantService aiAssistantService;
  private final CarService carService;

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
