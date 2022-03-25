package com.mateus.carRental.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserFormDTO {

	@NotEmpty
	private String cpf;
	
	@NotEmpty
	private String name;
	
	@NotNull
	private int age;
	
}
