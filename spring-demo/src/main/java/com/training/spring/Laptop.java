package com.training.spring;

public class Laptop {
	
	private String brand;
	private String model;
	
	public Laptop() {
		super();
	}
	
	public Laptop(String brand,String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getLaptopDetails() {
		return brand + " - " + model;
	}
}
