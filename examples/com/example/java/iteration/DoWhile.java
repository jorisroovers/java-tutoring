package com.example.java.iteration;

public class DoWhile {

	public static void main(String[] args) {
		// doWhile();
		doWhileVsWhile();
	}

	public static void doWhile() {
		System.out.println("DoWhile.doWhile()");
		// DO WHILE
		int j = 0;
		do {
			System.out.print(j + " ");
			j++;
		} while (j > 5);

		// NOTE: DO ... WHILE loops are almost never used

	}

	public static void doWhileVsWhile() {
		System.out.println("DoWhile.doWhileVsWhile()");
		// DO...WHILE: First iteration, BEFORE evaluating the condition!

		int j = 0;
		do {
			System.out.println("DO WHILE: " + j);
			j++;
		} while (j > 5);

		// WHILE: First iteration, AFTER evaluating the condition!
		j = 0;
		while (j > 5) {
			System.out.println("WHILE: " + j);
		}
		System.out.println("AFTER LOOPS");

	}

}
