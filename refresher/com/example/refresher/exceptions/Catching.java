package com.example.refresher.exceptions;

public class Catching {

	public static void main(String[] args) {
		exceptions();
		// catching();
		catchGeneric();
		catchMultiple();
		catchAll();

		// PRO-TIP: Exceptions occur in exceptional conditions, not as part of negative use-cases
		// For example: Invalid input is not an exception condition!

	}

	public static void exceptions() {

		// index out of bounds
		// int[] myArray = {};
		// myArray[-1] = 123;

		// Can't devide by zero
		// int x = 5 / 0;

		// This code is not reached when an exception is thrown
		System.out.println("Doing something important here...");
	}

	public static void catching() {
		try {
			// Can't devide by zero
			int x = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Handling ArithmeticException:" + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("Doing something important here");
	}

	public static void catchGeneric() {
		try {
			// Can't devide by zero
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("Handling Exception:" + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("Doing something important here");
	}

	public static void catchMultiple() {
		try {
			// index out of bounds
			int[] myArray = {};
			myArray[-1] = 123;

			// Can't devide by zero
			int x = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling ArrayIndexOutOfBoundsException:" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Handling ArithmeticException:" + e.getMessage());
		}
		System.out.println("Doing something important here");
	}

	public static void catchAll() {
		try {
			// index out of bounds
			int[] myArray = {};
			myArray[-1] = 123;

			// Can't devide by zero
			int x = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling ArrayIndexOutOfBoundsException:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Handling Exception:" + e.getMessage());
		}
		System.out.println("Doing something important here");
	}

}
