package com.example.java;

public class Enums {

	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	};

	public static void main(String[] args) {

		// Enums or Enumerations are used when there are only a limited set of options that can be chosen from.

		System.out.println("MONTHS.APRIL: " + Month.APRIL);

		Month month = Month.APRIL;
		if (month == Month.MAY) {
			System.out.println("The Month is May!");
		}

	}

}
