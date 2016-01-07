package com.example.java.oo.init;

/**
 * Constructors: default, custom, calling other constructors
 */
public class Car3 {

	private String color;

	private String brand;

	private int numberOfWheels;

	private static int totalCars;

	public Car3() {
		this.color = "Yellow"; // 'this' keyword is optional!
		brand = "Peugeot";
		numberOfWheels = 4;
	}

	/**
	 * Custom constructor that sets the color.
	 */
	public Car3(String color) {
		this.color = color; // use 'this' keyword if you have a parameter with the same name
	}

	public Car3(int numberOfWheels) {
		this("green"); // Call a different constructor, this MUST be the first statement
		this.numberOfWheels = numberOfWheels;
	}

	public Car3(String color, int numberOfWheels) {
		this("green"); // Call a different constructor
		// this(numberOfWheels); // not allowed! you can only call a single other constructor
		this.numberOfWheels = numberOfWheels;
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
		Car3.totalCars = totalCars;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
