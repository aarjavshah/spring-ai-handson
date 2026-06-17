package com.sample.arjav.spring_ai_demo.mcp.tool;

import com.sample.arjav.spring_ai_demo.api.dto.CarResponse;
import com.sample.arjav.spring_ai_demo.domain.entity.Car;
import com.sample.arjav.spring_ai_demo.domain.repository.CarRepository;
import java.util.List;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class CarMcpToolService {

  private final CarRepository carRepository;

  public CarMcpToolService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Tool(description = "Find a single car listing by its unique id.")
  public CarResponse findCarById(
      @ToolParam(description = "The unique numeric identifier of the car listing.") Long id) {
    return carRepository
        .findById(id)
        .map(this::toResponse)
        .orElse(new CarResponse(-1L, "NOT_FOUND", "No car found for id " + id));
  }

  @Tool(description = "Search available cars by brand name.")
  public List<CarResponse> findCarsByBrand(
      @ToolParam(description = "A full or partial brand name, for example: BMW or Tesla.")
          String brandName) {
    return carRepository.findByBrandNameContainingIgnoreCase(brandName).stream()
        .map(this::toResponse)
        .toList();
  }

  private CarResponse toResponse(Car car) {
    return new CarResponse(car.getId(), car.getBrandName(), car.getDescription());
  }
}

