package com.cars.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.api.model.Cars;

public interface CarsRepo extends JpaRepository<Cars, Long> {
    
}
