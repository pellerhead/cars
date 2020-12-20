package com.nelson.greg.cars.repository;

import com.nelson.greg.cars.model.Cars;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Cars, Integer> {
    @Procedure
    int GET_TOTAL_CARS_BY_MODEL(String model);
}