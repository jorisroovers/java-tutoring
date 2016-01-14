package com.example.java.jdk;

public class MathExample {

	public static void main(String[] args) {
		math();
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

}
