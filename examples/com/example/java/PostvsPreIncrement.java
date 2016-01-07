package com.example.java;

public class PostvsPreIncrement {

	public static void main(String[] args) {
		int number = 5;
		printNumber(number);

		System.out.println("PRE INCREMENT");
		printNumber(++number);
		// What the compiler really does:
		// number += 1 // -> line that is added by the compiler
		// printNumber(number);
		printNumber(number);
		System.out.println("----------");

		System.out.println("POST INCREMENT");
		printNumber(number++);
		// What the compiler really does:
		// printNumber(number);
		// number += 1 // -> line that is added by the compiler
		printNumber(number);
		System.out.println("----------");

	}

	public static void printNumber(int number) {
		System.out.println("The number is: " + number);
	}

}
