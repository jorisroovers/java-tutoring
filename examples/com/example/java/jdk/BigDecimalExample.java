package com.example.java.jdk;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {
		bigDecimal();
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

		System.out.println("BigDecimalExample.bigDecimal()");
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

}
