package com.mateus.carRental.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import com.mateus.carRental.model.TypeCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarFormDTO {

	private Integer id;
	
	@NotEmpty
	private String model;
	
	@NotNull
	private TypeCategory category;
	
	@NotNull
	private Double hourPrice;
}
