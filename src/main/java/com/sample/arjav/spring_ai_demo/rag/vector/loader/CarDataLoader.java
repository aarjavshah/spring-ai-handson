package com.sample.arjav.spring_ai_demo.rag.vector.loader;

import com.sample.arjav.spring_ai_demo.domain.repository.CarRepository;
import java.util.List;
import java.util.Map;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Component;

@Component
public class CarDataLoader {

  private final CarRepository carRepository;
  private final VectorStore vectorStore;

  public CarDataLoader(CarRepository carRepository, VectorStore vectorStore) {
    this.carRepository = carRepository;
    this.vectorStore = vectorStore;
  }

  //  @PostConstruct
  void loadAllData() {
    carRepository
        .findAll()
        .forEach(
            car -> {
              var carDocument =
                  new Document(
                      "id: "
                          + car.getId()
                          + ", brandName: "
                          + car.getBrandName()
                          + ", condition: "
                          + car.getCondition()
                          + ", description: "
                          + car.getDescription()
                          + ", color: "
                          + car.getColor()
                          + ", mileage: "
                          + car.getMileage()
                          + ", year of registration: "
                          + car.getRegistration()
                          + ", location: "
                          + car.getLocation(),
                      Map.of("carId", car.getId()));
              vectorStore.add(List.of(carDocument));

              try {
                Thread.sleep(2000);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
            });
  }
}

