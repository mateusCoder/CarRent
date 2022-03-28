package com.mateus.carRental.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.carRental.model.Car;
import com.mateus.carRental.model.TypeCategory;

public interface CarRepository extends JpaRepository<Car, Integer>{

	Page<Car> findByCategory(TypeCategory category, Pageable pagination);

}
