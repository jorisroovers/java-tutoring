package com.example.java.conditionals;

public class Switch {

	public static void main(String[] args) {
		// Switch on Strings: Java 7
		// You can switch: int, String, char
		// If a string can have many possible values, you can
		switchInt();
		// switchString();
		switchFallThrough();
	}

	public static void switchInt() {
		System.out.println("Switch.switchInt()");

		int number = 2;

		switch (number) {
		case 3:
			System.out.println("The number is 3");
			break;
		case 4:
			System.out.println("The number is 4");
			break;
		case 5:
			System.out.println("The number is 5");
			break;
		default:
			System.out.println("The number is not 3,4 or 5");
		}

	}

	public static void switchString() {
		System.out.println("Switch.switchString()");

		String value = "myValue";
		switch (value) {
		case "myValue":
			System.out.println("Found 'myValue'");
			break;
		case "different value":
			System.out.println("Found 'different value'");
			break;
		case "no break":
			System.out.println("Found 'no break'");
			break;
		default:
			System.out.println("Default value");
			// no break needed because last value
		}

	}

	public static void switchFallThrough() {
		String value = "myValue";
		switch (value) {
		case "myValue":
			System.out.println("Found 'myValue'");
		case "different value":
			System.out.println("Found 'different value'");
			break;
		case "foo":
		case "bar":
			System.out.println("FOO!");
			break;
		default:
			System.out.println("Default value");
			// no break needed because last value
		}

	}

}
