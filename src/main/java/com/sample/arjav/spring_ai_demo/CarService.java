package com.sample.arjav.spring_ai_demo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarRepository carRepository;

  public List<Car> getCars(String productId) {
    return carRepository.findAllById(List.of(Long.valueOf(productId)));
  }
}
