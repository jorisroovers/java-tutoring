package com.example.java.jdk;

import java.math.BigDecimal;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// Java comes with a lot of packages built-in ("batteries included") so you don't have to reinvent the wheel
		// These are part of the JDK. There are whole books describing the JDK, but best way is to search the interwebs
		// if you do something that is non-trivial

		// javaLangPackages();

		// readNumber();

	}

	public static void javaLangPackages() {
		// java.lang.* packages are included by default and don't need to be imported explicitly
		System.out.println("Simple.javaLangPackages()");
		String str = ""; // java.lang.String
		ArithmeticException e = null; // java.lang.ArithmeticException
	}

	public static void readNumber() {
		System.out.println("Simple.javaLangPackages()");
		// here we use java.util.Scanner to read from the console
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println("echo: " + n);

		reader.close(); // IMPORTANT!
	}

}
