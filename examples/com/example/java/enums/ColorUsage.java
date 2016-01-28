package com.example.java.enums;

public class ColorUsage {

	public static void main(String[] args) {
		Color myColor = Color.RED;

		// standard methods inherited from enum
		System.out.println("myColor.name():" + myColor.name());
		System.out.println("myColor.ordinal(): " + myColor.ordinal());

		// custom myColor methods
		System.out.println("myColor.getRgb(): " + myColor.getRgb());
		System.out.println("myColor: " + myColor);

	}

}
