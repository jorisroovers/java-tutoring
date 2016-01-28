package com.example.java;

public class ArithmeticExcercices {

	public static void main(String[] args) {
		// System.out.println((4 % -10));
		// ex1();
		ex2();
		// ex3();
		// ex4();
		// ex5();
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

		// NEGATIVE MODULO:
		// 3 * (4 % (5 * -2)) = 3 * (4 % -10) = 3 * 4 = 12
		// 4 % -10 = 4 because 4 doesn't fit in -10 (same as 4 doesn't fit in 10)
		// for more examples see com.example.java.Arithmetic
		System.out.println("3*(4%(5*-2)): " + (3 * (4 % (5 * -2))));
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

		i = 21;
		j = 42;
		k = 11;

		i = i - j + k * 7;
		System.out.println("i = " + i);

		i = 21;
		j = 42;
		k = 11;

		i = (i - j + k) * 7;
		System.out.println("i = " + i);

	}

	public static void ex4() {
		System.out.println("5 + 25 / 12 > 6: " + (5 + 25 / 12 > 6));
		System.out.println("5 <= 25 / 12 && 6 * 4 > 3: " + (5 <= 25 / 12 || 6 * 4 > 3));

		int x = 30;
		int y = 40;
		int a = 10;
		int b = 5;
		System.out.println("x + 2 < y || !(y == 40 && a * 2 > 5): " + (x + 2 < y || !(y == 40 && a * 2 > 5)));
		System.out.println("!(x + y < 10 || a == 9) && b > 3: " + (!(x + y < 10 || a == 9) && b > 3));
		System.out.println("x + y != 100 || (a == 1 && b > 3): " + (x + y != 100 || (a == 1 && b > 3)));
	}

	public static void ex5() {
		int a = 0;
		int b = 0;
		int c = 0;
		a = ++b + ++c;
		System.out.println("a = ++b + ++c;");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		a = 0;
		b = 0;
		c = 0;
		a = b++ + c++;
		System.out.println("a = b++ + c++;");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		a = 0;
		b = 0;
		c = 0;
		a = ++b + c++;
		System.out.println("a = ++b + c++;");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		a = 0;
		b = 0;
		c = 0;
		a = b-- + c--;
		System.out.println("a = b-- + c--;");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
