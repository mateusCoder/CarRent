package com.mateus.carRental.model;

public enum TypeCategory {
	
	SUV("SUV"),
	HATCHBACK("Hatchback"),
	SEDAN("Sedan"), 
	PICKUP("Pickup");
	
	private String description;

	TypeCategory(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}
