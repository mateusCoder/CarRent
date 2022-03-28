package com.mateus.carRental.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String model;
	
	@Enumerated(EnumType.STRING)
	private TypeCategory category;
	
	private Double hourPrice;

	public Car(String model, TypeCategory category, Double hourPrice) {
		this.model = model;
		this.category = category;
		this.hourPrice = hourPrice;
	}

}
