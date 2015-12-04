package com.example.refresher.methods;

public class BasicMethods {

	public static void main(String[] args) {
		// NOTE:
		// - methods are also sometimes referred to as functions, although in Java that's really not correct
		// - functions that don't return values are sometimes called procedures, but again that terminology is not
		// really common in the Java world
		BasicMethods.printMessage("Hello, World!");

		// call a method with parameters, assign the result to a variable
		int result = BasicMethods.add(5, 3);
		System.out.println("BasicMethods.add(5, 3): " + result);

		System.out.println("BasicMethods.evenOrOdd(512349): " + BasicMethods.evenOrOdd(512349));
		System.out.println("BasicMethods.evenOrOdd(1234): " + BasicMethods.evenOrOdd(1234));
	}

	/**
	 * This is a block-level comment. It is often used at the method or class level to describe what is going on. Why
	 * comments?
	 * <ul>
	 * <li>In the real world, you work on code in teams. Not everyone can read every line of code. You need to document
	 * what your methods do.</li>
	 * <li>After 6 months, you forget yourself what you've been doing.</li>
	 * <li>You can generate pretty reports from code comments that can act as (partial) external documentation.</li>
	 * </ul>
	 * 
	 * 
	 * Prints a given message to the console.
	 * 
	 * @param message
	 *            A message to be printed to the console.
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}

	/**
	 * Adds 2 integers.
	 * 
	 * @param a
	 *            first number
	 * @param b
	 *            second number
	 * @return the sum of the 2 given integers: a + b
	 */
	public static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Determines whether a given integer is even or odd.
	 * 
	 * @param n
	 *            number to check for parity (=even or odd).
	 * @return "even" if the given integer is even, "odd" otherwise.
	 */
	public static String evenOrOdd(int n) {
		if (n % 2 == 0) {
			return "even"; // return statement can occur everywhere, not just at the end
		}
		return "odd";
	}

}
