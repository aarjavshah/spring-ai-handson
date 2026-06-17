package com.sample.arjav.spring_ai_demo.domain.repository;

import com.sample.arjav.spring_ai_demo.domain.entity.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
  List<Car> findByBrandNameContainingIgnoreCase(String brandName);
}

