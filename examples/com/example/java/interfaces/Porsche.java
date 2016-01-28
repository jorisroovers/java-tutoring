package com.example.java.interfaces;

public class Porsche extends SportsCar {

	public Porsche(int horsePower) {
		super(horsePower);
	}

	@Override
	public String getBrand() {
		// Required by Car interface
		return "Porshe";
	}

	@Override
	public String getEngineType() {
		// Required by SportsCar abstract class
		return "V6";
	}

}
