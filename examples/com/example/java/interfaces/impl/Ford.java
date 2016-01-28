package com.example.java.interfaces.impl;

import com.example.java.interfaces.Car;

public class Ford implements Car {

	private final String brand;

	public Ford() {
		this.brand = "Ford";
	}

	@Override
	public void drive() {
		System.out.println("VROOM VROOM");
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

}
