package com.example.refresher.iteration;

public class For {

	public static void main(String[] args) {
		// Loops: let the computer do the work for you! DRY: Don't Repeat Yourself!
		// Loops are also called iteration, verb: to iterate
		basicForLoop();

		forEach();
	}

	public static void basicForLoop() {
		System.out.println("For.basicForLoop()");
		// FOR LOOPS
		// variable name i
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("----------------------------------------");

		// loop over items in an array
		String[] strings = { "Hello", " ", "World", ", ", "How", " ", "Are", " ", "You", "?" };
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------");

		System.out.println("# Start/End Condition and Step statements #");
		// The start/end and step statements don't need to be related at all
		int i = 0;
		int j = 5;
		int y = 1000;
		for (int x = 1000; i < 10; y -= 5) {
			j++;
			if (j == 20) {
				i = 10;
			}
			// System.out.println("y: " + y);
			// System.out.println("i: " + i);
			// System.out.println("j: " + j);
		}
		// System.out.println("x: " + x); // x is not defined outside the for loop -> scoping
		System.out.println("y: " + y);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println();

		// forever loop
		// You don't actually need to use any of them.
		// for (;;) {
		// System.out.print(".");
		// }

	}

	public static void forEach() {
		// foreach: loop over items in an array, easier
		String[] strings = { "Hello", " ", "World", ", ", "How", " ", "Are", " ", "You", "?" };
		for (String myString : strings) {
			System.out.print(myString);
		}
		System.out.println();
		System.out.println("----------------------------------------");

	}

}
