package com.example.refresher.iteration;

public class DoWhile {

	public static void main(String[] args) {
		doWhile();
	}

	public static void doWhile() {
		System.out.println("DoWhile.doWhile()");
		int i = 0;
		// DO WHILE
		int j = 0;
		do {
			System.out.println(j + " ");
			j++;
		} while (j < 5);

		// NOTE: DO ... WHILE loops are almost never used

	}

}
