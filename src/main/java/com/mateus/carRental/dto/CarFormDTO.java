package com.mateus.carRental.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.mateus.carRental.model.Car;
import com.mateus.carRental.model.TypeCategory;
import com.mateus.carRental.repository.CarRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarFormDTO {

	@NotEmpty
	private String model;
	
	@NotNull
	private TypeCategory category;
	
	@NotNull
	private Double hourPrice;

	public Car convertToCar(CarRepository carRepository) {
		return new Car(model, category, hourPrice);
	}
}
