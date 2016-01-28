package com.example.java.jdk.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		// These classes are new in Java 8!

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("LocalDate.now(): " + localDate);
		System.out.println("LocalTime.now(): " + localTime);
		System.out.println("LocalDateTime.now(): " + localDateTime);

	}

}
