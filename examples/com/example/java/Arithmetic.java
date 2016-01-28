package com.example.java;

public class Arithmetic {

	public static void main(String[] args) {
		// arithmetic();
		negativeModulo();
		// relational();
		// logical();
	}

	public static void arithmetic() {
		System.out.println("Basics.arithmetic()");
		// basic math
		System.out.println("# Basic Math #");
		System.out.println("5 + 5 = " + (5 + 5));
		System.out.println("10 - 4 = " + (10 - 4));
		System.out.println("2 * 3 = " + (2 * 3));
		System.out.println("6 / 3 = " + (6 / 3));
		System.out.println("6 / 4 = " + (6 / 4)); // integer division
		System.out.println("6.0 / 4.0 = " + (6.0 / 4.0)); // decimal division
		System.out.println("8 % 3 = " + (8 % 3)); // module: remainder

		System.out.println("# Operator precedence #");
		System.out.println("(8 + 3) * 5 / (2 % 3) = " + ((8 + 3) * 5 / (2 % 3))); // complex arithmetic
		System.out.println();

		System.out.println("# Relational operations take precendence #");
		System.out.println("8 + 3 > 5 * 4 = " + (8 + 3 > 5 * 4));

		// arithmetic convenience syntax
		System.out.println("# Arithmetic Convenience Syntax #");
		int x = 5;
		System.out.println("x = 5: " + x);
		x = x + 1; // increment with 1
		System.out.println("x = x + 1: " + x);
		x += 1; // same as x = x + 1
		System.out.println("x += 1: " + x);
		x++; // same as x+=1, so same as x = x + 1 (this is also where the name C++ comes from!)
		System.out.println("x++: " + x);
		x += 5; // you can also increase with more than 1
		System.out.println("x += 5: " + x);
		x -= 2; // decrease
		System.out.println("x -= 2: " + x);
		x *= 4; // multiply
		System.out.println("x *= 4: " + x);
		x /= 2; // divide
		System.out.println("x /= 2: " + x);
		x %= 3; // modulo
		System.out.println("x %= 3: " + x);
		System.out.println();

		System.out.println("# ++x vs. x++ #");
		x = 1;
		System.out.println("x = 1: " + x);
		System.out.println("++x: " + (++x));
		System.out.println("x: " + x);
		System.out.println("x++: " + (x++));
		System.out.println("x: " + x);
		System.out.println();

	}

	public static void negativeModulo() {
		// RULE: the sign of the result equals the sign of the dividend
		// SIMPLER: Do the normal modulo operation without taking the signs into account and then pick the
		// sign of the first part (=dividend).
		// e.g. -10 % 4 => -2 because the dividend has a negative sign
		// http://stackoverflow.com/a/4403556/381010

		// number greater than modulo operand
		System.out.println("-10 % 4: " + (-10 % 4));
		System.out.println("10 % -4: " + (10 % -4));
		System.out.println("-10 % -4: " + (-10 % -4));
		System.out.println();

		// number less than modulo operand
		System.out.println("-3 % 4: " + (-3 % 4));
		System.out.println("3 % -4: " + (3 % -4));
		System.out.println("-3 % -4: " + (-3 % -4));

	}

	public static void logical() {
		// boolean arithmetic
		System.out.println("# Boolean arithmetic #");

		System.out.println("## NOT ##");
		System.out.println("!true: " + (!true));
		System.out.println("!false: " + (!false));

		System.out.println("## AND ##");
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && false: " + (false && false));
		System.out.println();

		System.out.println("## OR ##");
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		System.out.println();

		// XOR (obscure, almost never used). Also, it can be written as combination or AND and OR:
		// A XOR B: (A AND (NOT B)) OR ((NOT A) AND B)
		System.out.println("## XOR ##");
		System.out.println("true ^ true: " + (true ^ true));
		System.out.println("false ^ false: " + (false ^ false));
		System.out.println("true ^ false: " + (true ^ false));
		System.out.println("false ^ true: " + (false ^ true));
		System.out.println();

		// shortcut evaluation
		// Most of the time, this is not a problem, but it can be when your methods have side-effects!
		System.out.println("# Shortcut Evaluation #");
		System.out.println("Basics.returnBool(false):" + Basics.returnBool(false));
		System.out.println("true ||  Basics.returnBool(false): " + (true || Basics.returnBool(false)));
		System.out.println("false &&  Basics.returnBool(true): " + (true || Basics.returnBool(true)));

	}

	public static void relational() {
		System.out.println("Basics.relational()");

		System.out.println("# Equality #");
		System.out.println("5 == 5: " + (5 == 5));
		System.out.println("5 == 4: " + (5 == 4));
		System.out.println("5 != 5: " + (5 != 5));
		System.out.println("5 != 4: " + (5 != 4));
		System.out.println();

		System.out.println("# Order #");
		System.out.println("5 > 4: " + (5 > 4));
		System.out.println("5 < 4: " + (5 < 4));
		System.out.println("5 >= 5: " + (5 >= 5));
		System.out.println("5 >= 4: " + (5 >= 4));
		System.out.println("5 <= 5: " + (5 <= 5));
		System.out.println("5 <= 6: " + (5 <= 6));

	}

}
