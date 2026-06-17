package com.sample.arjav.spring_ai_demo.application.service;

import com.sample.arjav.spring_ai_demo.domain.entity.Car;
import com.sample.arjav.spring_ai_demo.domain.repository.CarRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService {
  private final CarRepository carRepository;

  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public List<Car> getCars(String productId) {
    return carRepository.findAllById(List.of(Long.valueOf(productId)));
  }
}

