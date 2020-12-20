package com.nelson.greg.cars.controller;

import com.nelson.greg.cars.repository.CarRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarRepository carRepository;

    CarController(CarRepository carRepository) {
      this.carRepository = carRepository;
    }

    @GetMapping("/count")
    public int getCount() {
        return carRepository.GET_TOTAL_CARS_BY_MODEL("chevy");
    }
}
