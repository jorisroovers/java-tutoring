package com.example.java.oo.init;

/**
 * Order of init block, static init block and constructor invocation.
 */
public class Car4 {

	private String color;

	private String brand;

	private int numberOfWheels;

	private static int totalCars;

	{
		System.out.println("trace: Car4: object init block");
		color = "black";
	}

	static {
		System.out.println("trace: Car4: static init block");
		totalCars = 0;
	}

	public Car4() {
		System.out.println("trace: Car4: default constructor");
		this.color = "Yellow"; // 'this' keyword is optional + this overwrites init block!
		brand = "Peugeot";
		totalCars++; // This is how you would typically use this to count the number of cars
	}

	public Car4(String brand, String color, int numberOfWheels) {
		System.out.println("trace: Car4: custom constructor");
		this.brand = brand;
		this.color = color;
		this.numberOfWheels = numberOfWheels;
		totalCars++;
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
		Car4.totalCars = totalCars;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
