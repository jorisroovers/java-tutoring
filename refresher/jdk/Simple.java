package jdk;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// Java comes with a lot of tools built-in ("batteries included") so you don't have to reinvent the wheel
		// These are part of the JDK. There are whole books describing the JDK, but best way is to search the interwebs
		// if you do something that is non-trivial
		readNumber();
	}

	public static void readNumber() {
		// here we use java.util.Scanner to read from the console
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println("echo: " + n);

	}

}
