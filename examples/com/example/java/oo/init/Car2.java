package com.example.java.oo.init;

/**
 * Initialize using init blocks -> executed BEFORE constructor, each time an object is created.
 */
public class Car2 {

	private String color;

	private String brand;

	private int numberOfWheels; // default value -> 0

	private static int totalCars;

	{
		this.color = "red"; // 'this' keyword is optional
		brand = "Volvo";
	}

	static {
		// only executed once!
		totalCars = 5;
	}

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

	public static int getTotalCars() {
		return totalCars;
	}

	public static void setTotalCars(int totalCars) {
		Car2.totalCars = totalCars;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
