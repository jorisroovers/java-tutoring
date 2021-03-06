package com.example.java.exceptions;

import java.io.IOException;

public class Catching {

	public static void main(String[] args) {
		exceptions();
		// catching();
		catchGeneric();
		catchMultiple();
		catchAll();

	}

	public static void exceptions() {
		System.out.println("Catching.exceptions()");

		// index out of bounds
		// int[] myArray = {};
		// myArray[-1] = 123;

		// Can't devide by zero
		// int x = 5 / 0;

		// This code is not reached when an exception is thrown
		System.out.println("Doing something important here...");
	}

	public static void catching() {
		System.out.println("Catching.catching()");
		try {
			// Can't divide by zero
			int x = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Handling ArithmeticException:" + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("Doing something important here");
	}

	public static void catchGeneric() {
		System.out.println("Catching.catchGeneric()");
		try {
			// Can't divide by zero
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("Handling Exception:" + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("Doing something important here");
	}

	public static void catchMultiple() {
		System.out.println("Catching.catchMultiple()");
		try {
			// index out of bounds
			int[] myArray = {};
			myArray[-1] = 123;

			// Can't divide by zero
			int x = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling ArrayIndexOutOfBoundsException:" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Handling ArithmeticException:" + e.getMessage());
		}
		System.out.println("Doing something important here");
	}

	public static void catchAll() {
		System.out.println("Catching.catchAll()");
		try {
			// index out of bounds
			int[] myArray = {};
			myArray[-1] = 123;

			// Can't divide by zero
			int x = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling ArrayIndexOutOfBoundsException:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Handling Exception:" + e.getMessage());
		}
		System.out.println("Doing something important here");
	}

}
