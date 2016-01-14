package com.example.java.jdk;

import java.security.SecureRandom;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// random();
		secureRandom();
	}

	public static void random() {
		System.out.println("RandomExample.random()");

		Random random = new Random(); // picks a good random seed
		Random random2 = new Random(123456789); // set seed manually

		System.out.println("random.nextInt(): " + random.nextInt()); // can also be negative, all possible int values
		System.out.println("random.nextInt(100): " + random.nextInt(100)); // between 0 and 100
		System.out.println("random.nextBoolean(): " + random.nextBoolean());
		System.out.println("random.nextDouble(): " + random.nextDouble());
		System.out.println("random.nextFloat(): " + random.nextFloat());
		System.out.println("random.nextLong(): " + random.nextLong());
		System.out.println("random.nextGaussian(): " + random.nextGaussian()); // mean 0, std deviation = 1

	}

	public static void secureRandom() {

		// Problem with Random is that it's possible to predict future values if you have seen a number of values
		// This is a problem when using java.util.Random as part of encryption or as part of anything security related.
		// Therefore, use java.security.SecureRandom for this
		// SecureRandom uses true randomness (e.g. from /dev/random) vs. Random uses system clock
		// details:
		// http://stackoverflow.com/questions/11051205/difference-between-java-util-random-and-java-security-securerandom

		System.out.println("RandomExample.secureRandom()");
		SecureRandom random = new SecureRandom();
		System.out.println("random.nextInt(): " + random.nextInt()); // can also be negative, all possible int values
		System.out.println("random.nextInt(100): " + random.nextInt(100)); // between 0 and 100
		System.out.println("random.nextBoolean(): " + random.nextBoolean());
		System.out.println("random.nextDouble(): " + random.nextDouble());
		System.out.println("random.nextFloat(): " + random.nextFloat());
		System.out.println("random.nextLong(): " + random.nextLong());
		System.out.println("random.nextGaussian(): " + random.nextGaussian()); // mean 0, std deviation = 1
	}

}
