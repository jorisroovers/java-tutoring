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

		math();

		// bigDecimal();
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

	public static void math() {
		System.out.println("Simple.math()");
		System.out.println("Math.pow(2, 8): " + Math.pow(2, 8));
		System.out.println("Math.sqrt(144): " + Math.sqrt(144));
		System.out.println("Math.cbrt(27): " + Math.cbrt(27)); // cubic root
		System.out.println();

		System.out.println("# Rounding # ");
		System.out.println("Math.abs(5): " + Math.abs(5)); // not really rounding...
		System.out.println("Math.abs(-5): " + Math.abs(-5));
		System.out.println("Math.ceil(3): " + Math.ceil(3));
		System.out.println("Math.ceil(3.3): " + Math.ceil(3.3));
		System.out.println("Math.ceil(3.7): " + Math.ceil(3.7));
		System.out.println("Math.floor(3): " + Math.floor(3));
		System.out.println("Math.floor(3.3): " + Math.floor(3.3));
		System.out.println("Math.floor(3.7): " + Math.floor(3.7));
		System.out.println("Math.round(3): " + Math.round(3));
		System.out.println("Math.round(3.3): " + Math.round(3.3));
		System.out.println("Math.round(3.5): " + Math.round(3.5));
		System.out.println("Math.round(3.7): " + Math.round(3.7));
		System.out.println();

		System.out.println("# Min/Max #");
		System.out.println("Math.min(5, 10): " + Math.min(5, 10));
		System.out.println("Math.min(-5, -10): " + Math.min(-5, -10));
		System.out.println("Math.max(5, 10): " + Math.max(5, 10));
		System.out.println("Math.max(-5, -10): " + Math.max(-5, -10));
		System.out.println();

		System.out.println("# Exp/Log #");
		System.out.println("Math.exp(3): " + Math.exp(3)); // e^3
		System.out.println("Math.log(3): " + Math.log(3)); // log_e(3)
		System.out.println();

		System.out.println("# Constants #");
		System.out.println("PI: " + Math.PI);
		System.out.println("e: " + Math.E);
		System.out.println();

		System.out.println("# Random numbers #");
		System.out.println("Math.random(): ");
		// NOTE: This is really not a good way to generate truly random numbers: use SecureRandom for that!
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ", Math.random());
		}
		System.out.println();
		System.out.println();

		System.out.println("Math.random(): double between [0 - 10]: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ", Math.random() * 10);
		}
		System.out.println();
		System.out.println();

		System.out.println("Math.random(): integer between [0 - 10]: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", Math.round(Math.random() * 10));
		}
		System.out.println();
		System.out.println();

		System.out.println("# Geometry #");

		Math.sin(Math.PI / 2);
		Math.cos(Math.PI / 2);
		Math.tan(Math.PI / 2);
		Math.toDegrees(Math.PI / 2);
		Math.toRadians(45);

		// and *much* more: more complex math

	}

	public static void bigDecimal() {
		// Float and Double use the computer's internal representation of decimal numbers (IEEE 754)
		// This representation makes trade-offs between accuracy and efficiency. Concretely this means that for most
		// use-cases the use of floats or doubles suffices, but for applications that require high accuracy (like when
		// dealing with money) it does not. This is where BigDecimal comes in. It's operations are slower than regular
		// double or floats, but they are more accurate.
		// NOTE: You still cannot represent numbers exactly, this has to do with the binary system computers are based
		// on (similarly how base 10 can't represent 1/3, base 2 can not represent e.g. 0.2).
		// NOTE: similarly, BigInteger can be used to represent very big integer numbers
		// NOTE: Since BigDecimal is not a built-in type (i.e. part of java.lang.*), it doesn't have infix operators
		// defined (+,-,/, etc),
		// so you need to use BigDecimal's method it's operation.

		System.out.println("Simple.bigDecimal()");
		BigDecimal n1 = new BigDecimal(123.456);
		BigDecimal n2 = new BigDecimal(789.012);
		BigDecimal n3 = new BigDecimal(-2.0);

		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		// System.out.println("n2.toEngineeringString(): " + n2.toEngineeringString());
		// System.out.println("n2.toPlainString(): " + n2.toPlainString());
		System.out.println();

		System.out.println("n1.add(n2): " + n1.add(n2));
		System.out.println("n1: " + n1); // n1.add(n2) returns a new BigDecimal, it does not modify n1 itself
		System.out.println("n1.subtract(n2): " + n1.subtract(n2));
		System.out.println("n2.divide(n1): " + n1.divide(n3));
		System.out.println("n2.multiply(n1): " + n1.multiply(n1));
		System.out.println("n3.pow(4): " + n3.pow(4));
		System.out.println("n2.remainder(n1): " + n2.remainder(n1));
		System.out.println();

		System.out.println("n3.abs(): " + n3.abs());
		System.out.println("n2.negate(): " + n2.negate());
		System.out.println("n3.negate(): " + n3.negate());
		System.out.println("n2.plus(): " + n2.plus());
		System.out.println("n3.plus(): " + n3.plus());
		System.out.println();

		// Since there are no relational operators available, you need to use compareTo
		System.out.println("n1.compareTo(n1): " + n1.compareTo(n1)); // equal
		System.out.println("n1.compareTo(n2): " + n1.compareTo(n2)); // less than
		System.out.println("n1.compareTo(n3): " + n1.compareTo(n3)); // greater than
		System.out.println();

		System.out.println("n2: " + n2);
		System.out.println("n2.scale(): " + n2.scale()); // scale = number of digits after the decimal point
		System.out.println("n2.precision(): " + n2.precision()); // precision = number of digits in unscaled value
		System.out.println("n2.movePointRight(3): " + n2.movePointRight(3));
		System.out.println("n2.movePointLeft(3) : " + n2.movePointLeft(3));
		System.out.println("n2.movePointRight(3): " + n2.movePointRight(3));
		System.out.println("n2.scaleByPowerOfTen(3): " + n2.scaleByPowerOfTen(3));
		System.out.println("n2.scaleByPowerOfTen(-3): " + n2.scaleByPowerOfTen(-3));

		System.out.println();

		System.out.println("n2.min(n1): " + n2.min(n1));
		System.out.println("n2.max(n1): " + n2.max(n1));

	}

	public static void secureRandom() {
		// TODO (joris.roovers): implement
	}

}
