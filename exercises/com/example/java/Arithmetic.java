package com.example.java;

public class Arithmetic {

	public static void main(String[] args) {
		// ex1();
		// ex2();
		ex3();
	}

	public static void ex1() {
		System.out.println("2+3*4: " + (2 + 3 * 4));

		System.out.println("(2+3)*4: " + ((2 + 3) * 4));

		System.out.println("6*3/2*4: " + (6 * 3 / 2 * 4));

		System.out.println("6*3/(2*4): " + (6 * 3 / (2 * 4)));

		System.out.println("6*(8%(2*3)): " + (6 * (8 % (2 * 3))));

		System.out.println("17/8+9%5-3*2: " + (17 / 8 + 9 % 5 - 3 * 2));

		System.out.println("17/(8+9)%(5-3)*2: " + (17 / (8 + 9) % (5 - 3) * 2));

		// System.out.println("12/(2*8%4): " + (12 / (2 * 8 % 4)));

		System.out.println("20*17/8%4: " + (20 * 17 / 8 % 4));
	}

	public static void ex2() {
		// = 2 % 3 = 2
		System.out.println("8/6%3: " + (8 / 6 % 3));
		System.out.println("(102-80)*5: " + ((102 - 80) * 5));
		System.out.println("(102-80)*5.4: " + ((102 - 80) * 5.4));
		System.out.println("21*3/2*3: " + (21 * 3 / 2 * 3));
		System.out.println("(18%4)/(64%8-32/4): " + (18 % 4) / (64 % 8 - 32 / 4));
		System.out.println("3*(4%(5*2)): " + (3 * (4 % (5 * 2))));
		// 17/2*(4+23/3) = 17 / 2 * (4 + 7) = 17 / 2 * 11 = 8 * 11 = 88
		System.out.println("17/2*(4+23/3): " + (17 / 2 * (4 + 23 / 3)));
		// = 12 / 12 / 4 = 1 / 4 = 0
		System.out.println("12/(25%13)/(7-3): " + (12 / (25 % 13) / (7 - 3)));
		// = -24 / 12 = -2
		System.out.println("-24/(-3*-4): " + (-24 / (-3 * -4)));
		// = -24 / - 12 = 2
		System.out.println("-24/(-3*4): " + (-24 / (-3 * 4)));
		// 7 / 0 = impossible
		// System.out.println("7/(5%1): " + (7 / (5 % 1)));

	}

	public static void ex3() {
		int i = 21;
		int j = 42;
		int k = 11;

		i = 4 * (j + 16) % k; // = 4 * (42+16) % 11 = 4 * 58 % 11 = 232 % 11 = 1
		System.out.println("i = " + i);

		i = i - j + k * 7;
		System.out.println("i = " + i);

		i = (i - j + k) * 7;
		System.out.println("i = " + i);

	}

}
