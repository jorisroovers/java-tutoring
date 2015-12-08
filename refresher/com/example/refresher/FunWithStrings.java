package com.example.refresher;

import java.util.Arrays;

public class FunWithStrings {

	public static void main(String[] args) {
		// basics();
		// equality();
		methods();
		// regex();
	}

	public static void basics() {
		System.out.println("FunWithStrings.basics()");
		String myString = "Hello World!";
		System.out.println("myString: " + myString);
		System.out.println("myString.length(): " + myString.length());

		// iterate through all characters in a string
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(myString.charAt(i) + ".");
		}
		// char[] chArray = myString.toCharArray();

		System.out.println();
		System.out.println();
	}

	public static void equality() {
		System.out.println("FunWithStrings.equality()");
		String myString = "Hello World!";
		String nullString = null;

		System.out.println("myString.equals(\"foobar\"): " + myString.equals("foobar"));
		System.out.println("myString.equals(\"Hello World!\"): " + myString.equals("Hello World!"));
		System.out.println("myString.equals(nullString): " + myString.equals(nullString));
		// BEST PRACTICE: always put the literal string first!
		System.out.println("\"foobar\".equals(nullString): " + "foobar".equals(nullString));
		// nullString.equals("foobar"); // this will throw a Null Ptr Exception

		System.out.println("myString.equalsIgnoreCase(\"hello world!\"): " + myString.equalsIgnoreCase("hello world!"));

		System.out.println();
	}

	public static void methods() {
		System.out.println("FunWithStrings.methods()");
		String myString = "Hello World!";

		System.out.println("myString.isEmpty(): " + myString.isEmpty());
		System.out.println("\"\".isEmpty(): " + "".isEmpty());
		System.out.println("myString.contains(\"Hello\"): " + myString.contains("Hello"));
		System.out.println("myString.startsWith(\"Hello\"): " + myString.startsWith("Hello"));
		System.out.println("myString.startsWith(\"foo\"): " + myString.startsWith("foo"));
		System.out.println("myString.indexOf(\"Wor\"): " + myString.indexOf("Wor"));
		System.out.println("myString.indexOf('o'): " + myString.indexOf('o'));
		System.out.println("myString.indexOf('o', 4): " + myString.indexOf('o', 5));
		System.out.println("myString.lastIndexOf(\"World\"): " + myString.lastIndexOf("World"));
		System.out.println("myString.lastIndexOf('o'): " + myString.lastIndexOf('o'));
		System.out.println();

		// substring operations return a new string
		System.out.println("myString.substring(4): " + myString.substring(4));
		// substring(begin, end): [begin-index, end-index[ (not begin-index, length)!
		// end-index not included!
		System.out.println("myString.substring(4, 10): " + myString.substring(4, 10));

		System.out.println("myString: " + myString);
		// concat modifies the current string
		System.out.println("myString.concat(\" It's a great day!\"): " + myString.concat(" It's a great day!"));
		System.out.println("myString: " + myString);

		System.out.println("myString.replace(\"World\", \"John\"): " + myString.replace("World", "John"));
		System.out.println();

		System.out.println("myString.split(\" \"): " + Arrays.toString(myString.split(" ")));

		System.out.println();
	}

	public static void regex() {
		String myString = "Hello World!";
		System.out.println("myString.matches(\"^Hello(.*)\"): " + myString.matches("^Hello(.*)"));
	}

}
