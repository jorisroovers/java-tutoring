package com.example.java.arrays;

public class MultipleOfFive {

	public static void main(String[] args) {
		multipleOfFive();
	}

	public static void multipleOfFive() {
		int arraySize = 50;
		int[] multiples = new int[arraySize];
		// fill the array
		for (int i = 0; i < multiples.length; i++) {
			multiples[i] = i * 5;
		}

		// read array
		for (int i = 0; i < multiples.length; i++) {
			System.out.print(multiples[i] + " ");
		}

	}

}
