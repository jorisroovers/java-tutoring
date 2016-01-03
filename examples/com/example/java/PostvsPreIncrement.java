package com.example.java;

public class PostvsPreIncrement {

	public static void main(String[] args) {
		int nummer = 5;
		drukGetalAf(nummer);

		System.out.println("PRE INCREMENT");
		drukGetalAf(++nummer);
		// WAT DE COMPILER ECHT DOET:
		// nummer += 1 // -> stiekem door de compiler toegevoegd
		// drukGetalAf(nummer);
		drukGetalAf(nummer);
		System.out.println("----------");

		System.out.println("POST INCREMENT");
		drukGetalAf(nummer++);
		// WAT DE COMPILER ECHT DOET:
		// drukGetalAf(nummer);
		// nummer += 1 // -> stiekem door de compiler toegevoegd
		drukGetalAf(nummer);
		System.out.println("----------");

	}

	public static void drukGetalAf(int getal) {
		System.out.println("Het getal is: " + getal);
	}

}
