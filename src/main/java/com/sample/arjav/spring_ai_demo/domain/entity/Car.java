package com.sample.arjav.spring_ai_demo.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
  @Id private Long id;

  @Column(name = "brandname")
  private String brandName;

  private String condition;
  private String description;
  private String color;
  private Long mileage;
  private Long registration;
  private String location;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Long getMileage() {
    return mileage;
  }

  public void setMileage(Long mileage) {
    this.mileage = mileage;
  }

  public Long getRegistration() {
    return registration;
  }

  public void setRegistration(Long registration) {
    this.registration = registration;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}

