package com.example.java.enums;

public class SimpleEnums {

	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	};

	public static void main(String[] args) {
		simpleUsage();

	}

	public static void simpleUsage() {
		// Enums or Enumerations are used when there are only a limited set of options that can be chosen from.
		System.out.println("MONTHS.APRIL: " + Month.APRIL);
		System.out.println("MONTHS.MARCH.name(): " + Month.MARCH.name());
		System.out.println("MONTHS.MARCH.ordinal(): " + Month.MARCH.ordinal()); // ordinal -> position in the enum

		// Enums are just types!
		Month month = Month.APRIL;
		if (month == Month.MAY) {
			System.out.println("The Month is May!");
		}

		// Month.values() returns an array of all values
		System.out.print("Month.values(): ");
		for (Month m : Month.values()) {
			System.out.print(m + " ");
		}
		System.out.println();

	}

}
