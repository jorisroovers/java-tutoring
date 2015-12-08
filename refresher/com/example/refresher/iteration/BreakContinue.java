package com.example.refresher.iteration;

public class BreakContinue {

	public static void main(String[] args) {
		breakLoop();
		// breakOuter();
		// continueLoop();
	}

	public static void breakLoop() {
		System.out.println();
		// BREAK: preemptively stopping the loop
		System.out.println("BREAK");
		int i = 0;
		while (i < 5) {
			System.out.println(i + " ");
			if (i == 3) {
				break;
			}
			i++;
		}
		System.out.println("----------------------------------------");
	}

	public static void breakOuter() {
		System.out.println("BreakContinue.breakOuter()");
		int i = 0;
		// use a label to break an outer loop
		outerLoop: while (i < 5) {
			int j = 0;
			System.out.println("New outer loop, i=" + i);
			while (j < 5) {
				System.out.printf("i=%d, j=%d %n", i, j);
				if (i == 3 && j == 4) {
					break outerLoop;
				}
				j++;
			}
			i++;
		}
	}

	public static void continueLoop() {
		// CONTINUE: Skip an iteration
		System.out.println("BreakContinue.continueLoop()");
		int i = 0;
		while (i < 5) {
			i++;
			if (i == 3) {
				continue;
			}
			System.out.println(i + " ");

		}
		// NOTE: you can also continue an outer loop using labels -> see #breakOuter();
	}

}
