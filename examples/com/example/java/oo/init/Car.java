package com.example.java.oo.init;

/**
 * Initialize by setting value directly.
 *
 */
public class Car {

	private String color = "Green";

	private String brand = "Ford";

	private int numberOfWheels; // default value -> 0

	private static int totalCars = 5;

	// getters and setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public static int getTotalCars() {
		return totalCars;
	}

	public static void setTotalCars(int totalCars) {
		Car.totalCars = totalCars;
	}

}
