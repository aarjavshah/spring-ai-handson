package com.sample.arjav.spring_ai_demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {
  @Id Long id;

  @Column(name = "brandname")
  String brandName;

  String condition;
  String description;
  String color;
  Long mileage;
  Long registration;
  String location;
}
