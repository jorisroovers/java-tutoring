package com.example.java.interfaces;

public abstract class SportsCar implements Car {

	private int horsePower;

	public SportsCar(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void drive() {
		int amountOfRs = this.horsePower / 20;
		for (int i = 0; i < 2; i++) {
			System.out.print("V");
			for (int j = 0; j < amountOfRs; j++) {
				System.out.print("R");
			}
			System.out.print("OOM ");
		}
		System.out.println();
	}

	public abstract String getEngineType();

}
