package com.example.refresher;

public class Recursion {

	public static void main(String[] args) {
		// System.out.println("5!: " + factorial(5));
		System.out.println("5!: " + factorial(5));

		System.out.println("Fibonacci Sequence:");
		for (int i = 0; i < 15; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		// NOTE: This is quite an inefficient way to calculate a fibonacci sequence
		// Using a cache makes it more efficient.

	}

	/**
	 * Calculates n! using recursion.
	 * 
	 * @param n
	 *            number to calculate factorial for
	 * @return n!
	 */
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	/**
	 * Calculates Fibonacci(n) using recursion.
	 * 
	 * @param n
	 *            Fibonacci number to determine.
	 * @return the n-th fibonacii number.
	 */
	public static int fibonacci(int n) {
		if (n <= 1)
			return 1;
		else {
			int fn2 = fibonacci(n - 2);
			int fn1 = fibonacci(n - 1);
			return fn2 + fn1;
		}

	}

}
