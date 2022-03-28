package com.mateus.carRental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.carRental.dto.CarDTO;
import com.mateus.carRental.model.Car;
import com.mateus.carRental.model.TypeCategory;
import com.mateus.carRental.repository.CarRepository;

@RestController
@RequestMapping(path = "/cars")
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@GetMapping
	public Page<CarDTO> list(@RequestParam(required = false) TypeCategory category, 
			@PageableDefault(sort = "id", direction = Direction.ASC, size = 100) Pageable pagination) {
		
		if(category == null) {
			Page<Car> car = carRepository.findAll(pagination);
			return CarDTO.convertToDTO(car);
		}else {
			Page<Car> car = carRepository.findByCategory(category, pagination);
			return CarDTO.convertToDTO(car);
		}
	}

}
