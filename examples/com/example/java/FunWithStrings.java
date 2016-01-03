package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class FunWithStrings {

	public static void main(String[] args) {
		// basics();
		equality();
		// methods();
		// format();
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

		// == vs. equals()
		System.out.println("== vs. equals()");
		String myString1 = "foo";
		String myString2 = "foo";

		System.out.println("myString1 == myString2: " + (myString1 == myString2));
		Scanner input = new Scanner(System.in);
		System.out.print("Provide inputStr1: ");
		String inputStr1 = input.nextLine();
		System.out.print("Provide inputStr2: ");
		String inputStr2 = input.nextLine();
		System.out.println("inputStr1 == inputStr2: " + (inputStr1 == inputStr2));
		System.out.println("inputStr1.equals(inputStr2): " + (inputStr1.equals(inputStr2)));

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

	public static void format() {
		// Strings
		String msg = String.format("Hi, my name is %s %s", "John", "Smith");
		System.out.println(msg);
		// for most (not all) format specifiers, you can also use CAPITAL LETTERS -> %S instead of %s
		msg = String.format("Hi, my name is %S %S", "John", "Smith");
		System.out.println(msg);
		System.out.println();

		// integer, long, short
		msg = String.format("The integer two in decimal digits is '%d'", 2);
		System.out.println(msg);
		msg = String.format("The short two in decimal digits is '%d'", (short) 2);
		System.out.println(msg);
		msg = String.format("The long two in decimal digits is '%d'", 2L);
		System.out.println(msg);
		msg = String.format("The integer ten in octal digits is '%o'", 10); // %o -> octal
		System.out.println(msg);
		System.out.println();

		// floats/doubles
		msg = String.format("The number PI is approximately equal to %f", 3.141592);
		System.out.println(msg);
		// precision > .1f -> 1 decimal, .2f -> 2 decimals, etc
		msg = String.format("The number PI is approximately equal to %.1f", 3.141592);
		System.out.println(msg);
		msg = String.format("The number PI is approximately equal to %.2f", 3.141592);
		System.out.println(msg);
		msg = String.format("The number PI is approximately equal to %.3f", 3.141592);
		System.out.println(msg);
		msg = String.format("The number PI is approximately equal to %e", 3.141592); // %e -> scientific notation
		System.out.println(msg);
		// %a -> hexadecimal floating-point number with a significand and an exponent
		msg = String.format("The number PI is approximately equal to %a", 3.141592);
		System.out.println(msg);
		System.out.println();

		// TODO(joris.roovers): continue here:
		// https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

	}

	public static void regex() {
		String myString = "Hello World!";
		System.out.println("myString.matches(\"^Hello(.*)\"): " + myString.matches("^Hello(.*)"));
	}

}
