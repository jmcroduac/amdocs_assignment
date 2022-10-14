package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	@Autowired
	private Car myCar;
	
	public Person(int age) {
		super();
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}

	public String getPersonDetails() {
		return firstName + " " + lastName +"CAR DETAILS: " + myCar.getCarDetails();
	}
}
