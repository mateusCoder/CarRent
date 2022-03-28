package com.mateus.carRental.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Page;

import com.mateus.carRental.model.Car;
import com.mateus.carRental.model.TypeCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String model;
	
	@Enumerated(EnumType.STRING)
	private TypeCategory category;
	
	private Double hourPrice;
	
	public CarDTO(Car car) {
		this.id = car.getId();
		this.model = car.getModel();
		this.category = car.getCategory();
		this.hourPrice = car.getHourPrice();
	}
	
	public static Page<CarDTO> convertToDTO(Page<Car> car){
		return car.map(CarDTO::new);
	}
}
