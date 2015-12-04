package com.example.refresher;

import java.util.Iterator;

public class FunWithStrings {

	public static void main(String[] args) {
		String myString = "Hello World!";

		// iterate through all characters in a string
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(myString.charAt(i) + ".");
		}
		System.out.println();

		System.out.println("myString.contains(\"Hello\"): " + myString.contains("Hello"));

		System.out.println();

	}

}
