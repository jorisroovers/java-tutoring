package com.example.refresher;

public class Recursion {

	public static void main(String[] args) {
		int n5 = Recursion.factorial(5);
		System.out.println("5!: " + n5);
	}

	/**
	 * Calculates n! using recursion
	 * 
	 * @param n
	 *            number to calculate factorial for
	 * @return n!
	 */
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n * Recursion.factorial(n - 1);
	}

	public static int printFibbonaciSequence(int n) {
		// TODO (joris.roovers): implement
		return 0;
	}

}
