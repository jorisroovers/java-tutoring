// Use packages to provide structure to your program
package com.example.refresher;

import java.util.Scanner;

/**
 * Simple class show-casing basic java capabilities.
 * 
 */
public class Basics {

	public static void main(String[] args) {
		output();

		// alternatively, you can invoke static methods using the class Name.
		// Basics.output();

		variables();

		// arithmetic();

		// types();

		// arrays();

		// conditionals();

		// conditionalsSwitch();

		// loops();

		// int x = 123;
		// scoping(x);
		// // note that the reassignment of parameter x does not have effect outside Basics.scoping().
		// // We call this assignment by value
		// // IMPORTANT: This is only true for *primitive* types!
		// System.out.println("x (after Basics.scoping(x)): " + x);

		// print all program arguments. Note that we call them "arguments" and not "parameters".
		// for (String arg: args){
		// System.out.println(arg);
		// }

	}

	public static void output() {
		System.out.println("Hello " + "World!");
		// Notice how we concatenate 2 strings using +
		System.out.println("");

		// print vs. println
		System.out.print("Hello ");
		System.out.println("World!");
		System.out.println("");

		// Escaping
		System.out.println("John said: \"Hello Jessica!\"");

		// System.err.println("This prints to the standard error output");
		// notice that this can be out of order!

	}

	public static Boolean returnBool(final Boolean bool) {
		System.out.println("calling returnBool(" + bool + ") -> " + bool);
		return bool;
	}

	public static void variables() {
		// "declare" a variable: creating it (= allocating it in memory). Specify <type> <variableName>.
		int numberNoVal; // you can declare without defining, but you cannot print it without assigning a value first
		// System.out.println(numberNoVal); // this doesn't work

		// Variables names can be of arbitrary length, but can only contain alphanumerical characters, dollar signs and
		// underscores (and not start with a number).
		int myVeryLongVariableNameThatGoesOnForeverAndEver; // this is fine, NOTE: camelCase (and not underscores)
		int nameWithNumb3r5inIt;
		// int 5artingWithNumber; // not allowed to start with a number
		int with$pecial_chars;
		// int foo*!()notAllowed; // other chars not allowed

		// defining a variable: declaring + assigning value
		int numberWithVal = 5;
		System.out.println(numberWithVal);

		// You can also define variables as final, meaning that they cannot be modified from their initial value.
		final double PI = 3.1415;
		System.out.println("PI: " + PI);
		// PI = 4.0; // this won't work, you cannot reassing final variable

	}

	public static void types() {
		// variables allow you to store values so that you can refer to them later. They are fundamental to programming.
		// In java and many other programming languages, variables are typed.
		// Why types?
		// - Important for memory allocation.
		// - But mostly to detect errors in programs before running them. For example, you can't divide integers by
		// strings.
		// Also, the terms 'type' and 'class' are sometimes used interchangeably.

		// integers
		// primitive types: cannot be nullified, cannot be used in generic datastructures, don't have methods etc.
		int number = 5;
		Integer numberObj = 7;
		System.out.println("number: " + number);
		// note: type sizes (e.g. Integer.BYTES) are JVM dependent!
		System.out.println("numberObj:" + numberObj + " class: " + numberObj.getClass() + " bytes: " + Integer.BYTES);
		System.out.println("Integer MIN VALUE:" + Integer.MIN_VALUE + ", MAX VALUE:" + Integer.MAX_VALUE);
		System.out.println();

		short shortNumber = 5; // what happens here is type-coercion (integer is coerced to a short)
		Short shortObj = 2;
		// shortObj = 64000; // this won't work because 64000 doesn't fit in a short
		System.out.println("shortObj:" + shortObj + " class: " + shortObj.getClass() + " bytes: " + Short.BYTES);
		System.out.println("Short MIN VALUE:" + Short.MIN_VALUE + ", MAX VALUE:" + Short.MAX_VALUE);
		System.out.println();

		long longNumber = 123;
		Long longObj = 456l; // notice the L at the end
		System.out.println("longObj:" + numberObj + " class: " + longObj.getClass() + " bytes: " + Long.BYTES);
		System.out.println("Long MIN VALUE:" + Long.MIN_VALUE + ", MAX VALUE:" + Long.MAX_VALUE);
		System.out.println();

		// Note: You can do bigger numbers using BigInteger or unsigned types, but that's beyond the basics

		// booleans = true or false
		boolean myBool = true;
		Boolean boolObj = false;
		System.out.println("boolObj:" + boolObj + " class: " + boolObj.getClass());

		// decimals!
		float decimalNumber = 10.0f; // notice the 'f'
		// note that double precision is the default in Java
		double doublePrecision = 10.0;
		double scientificNotation = 3.2e3; // 3.2 * 10^3 = 3200
		System.out.println("scientificNotation: " + scientificNotation);
		System.out.println();

		// chars
		char a = 'a';
		char b = 98; // ASCII
		Character capitalC = 67;
		System.out.println("a:" + a + ", b: " + b + ", C: " + capitalC);

		// Strings
		// A string is really a series of characters ended by the 'null character' \0. Since it's such a common
		// use-case it has its own type.
		String myString = "Hello World!";
		System.out.println("myString: " + myString);

		// It's also easy to convert other (non-primitive types to strings) using toString()
		String myIntStr = numberObj.toString();
		System.out.println("myIntStr: " + myIntStr);

		// Many types also provide parse methods to convert strings to numbers
		int parsedInteger = Integer.parseInt("123");
		System.out.println("parsedInteger: " + parsedInteger);
		// This is actually also what happens when you call System.out.println or when you concatenate variables with
		// Strings

		// null values
		// Only Objects can be null meaning they don't have any value. Primitive types cannot!
		String nullString = null;
		System.out.println("nullString: " + nullString);

		// int nullInt = null; // this won't work
		Integer nullInteger = null; // this will!
		System.out.println("nullString: " + nullInteger);

		// IMPORTANT: Null values are often used, but be very careful with them. They cause a lot of bugs!
		// So many that some programming languages have banned them completely. With great power comes great
		// responsibility!
	}

	public static void arithmetic() {
		System.out.println("Basics.arithmetic()");
		// basic math
		System.out.println("# Basic Math #");
		System.out.println("5 + 5 = " + (5 + 5));
		System.out.println("10 - 4 = " + (10 - 4));
		System.out.println("2 * 3 = " + (2 * 3));
		System.out.println("6 / 3 = " + (6 / 3));
		System.out.println("8 % 3 = " + (8 % 3)); // module: remainder
		System.out.println("(8 + 3) * 5 / (2 % 3) = " + ((8 + 3) * 5 / (2 % 3))); // complex arithmetic
		System.out.println();

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

	public static void arrays() {
		System.out.println("Basics.arrays()");
		// an Array is just a homogeneous (=same type) list of items

		// array with 3 elements
		int[] myIntArray = new int[3];

		// arrays always start at 0 (this is the case in (almost) all programming languages)
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		// myIntArray[3] = "Hello World!"; // this won't work because the type is different
		System.out.println("myIntArray: " + myIntArray[0] + " " + myIntArray[1] + " " + myIntArray[2]);
		// System.out.println("Won't work:" + myIntArray[-1]);

		// The same as above, but more concisely
		int[] myIntArray2 = { 40, 50, 60 };
		// alterative syntax
		// int[] myIntArray2 = new int[]{40, 50, 60};
		System.out.println("myIntArray2: " + myIntArray2[0] + " " + myIntArray2[1] + " " + myIntArray2[2]);

		// If you don't define a value for a position in the array, it will fallback to the default value for the type
		// Note that the compiler does not allow this for regular variables (int x; sysout(x); -> not allowed).
		int[] myIntArray3 = new int[3];
		myIntArray3[0] = 10;
		myIntArray3[2] = 30;
		System.out.println("myIntArray3: " + myIntArray3[0] + " " + myIntArray3[1] + " " + myIntArray3[2]);

		// Note that you can use also Integer instead of int
		Integer[] myObjArray = new Integer[] { 5, null, 15 };
		System.out.println("myObjArray: " + myObjArray[0] + " " + myObjArray[1] + " " + myObjArray[2]);

		// Or an array of Strings
		String[] myStrArray = new String[] { "Hello", "World", "!" };
		System.out.println("myStrArray: " + myStrArray[0] + " " + myStrArray[1] + " " + myStrArray[2]);

		// Getting the length of an array
		System.out.println("Length of myIntArray2: " + myIntArray2.length);

		// Accessing last element
		System.out.println("myIntArray2, last element:" + myIntArray2[myIntArray2.length - 1]);

		// Nested arrays
		int[][] myMatrix = new int[2][2];
		myMatrix[0][0] = 10;
		myMatrix[0][1] = 20;
		myMatrix[1][0] = 30;
		myMatrix[1][1] = 40;
		System.out.println("myMatrix: ");
		System.out.println(myMatrix[0][0] + " " + myMatrix[0][1]);
		System.out.println(myMatrix[1][0] + " " + myMatrix[1][1]);

		// more concisely:
		int[][] myMatrix2 = new int[][] { { 10, 20 }, { 30, 40 } };
		System.out.println("myMatrix2: ");
		System.out.println(myMatrix2[0][0] + " " + myMatrix2[0][1]);
		System.out.println(myMatrix2[1][0] + " " + myMatrix2[1][1]);
	}

	public static void conditionals() {
		System.out.println("Basics.conditionals()");
		System.out.println("# Basic if #");
		if (true) {
			System.out.println("if True");
		}
		if (false) {
			// this code is unreachable. Also referred to as "dead code". The compiler will remove this (=optimization).
			System.out.println("if False"); // never printed
		}

		if (5 == 5) {
			// NOTE: because this is such a trivial comparison, the compiler will optimize this by removing the if
			// statement
			System.out.println("5 == 5");
		}

		if (5 != 6) {
			System.out.println("5 != 6");
		}

		System.out.println("# Basic if: variables #");
		int x = 5;
		int y = 5;
		if (x == y) {
			System.out.println("x == y");
		}

		x = 5;
		y = 6;
		if (x == y - 1) {
			System.out.println("x == y - 1");
		}
		System.out.println();

		System.out.println("# If/Else #");
		if (x == y) {
			System.out.println("Not printed!");
		} else {
			System.out.println("else: x != y");
		}
		System.out.println();

		System.out.println("# If/Else if /Else #");
		// x = 0;s
		// x = 1;
		// x = -1;
		if (x < 0) {
			System.out.println("x is negative");
		} else if (x > 0) {
			System.out.println("x is positive");
		} else {
			System.out.println("x is 0!");
		}
		System.out.println();

		System.out.println("# Shorthand notation #");
		// NOTE: This only works for a single line of code!
		// Best practice: always (!) use curly brackets: {}
		x = 5;
		if (x >= 5)
			System.out.println("x > 5");
		else if (x > 3)
			System.out.println("3 > x > 5");
		else
			System.out.println("x < 3");

	}

	public static void conditionalsSwitch() {
		System.out.println("Basics.conditionalsSwitch()");

		// If a string can have many possible values, you can
		String value = "myValue";
		switch (value) {
		case "myValue": {
			System.out.println("Found 'myValue'");
			break;
		}
		case "different value": {
			System.out.println("Found 'different value'");
			break;
		}
		case "no break": {
			System.out.println("Found 'different value'");
		}
		default: {
			System.out.println("Default value");
			// no break needed because last value
		}
		}

	}

	public static void scoping(int param) {
		System.out.println("Basics.scoping()");

		System.out.println("# Function Scope #");
		System.out.println("param:" + param);
		// You can redefine parameters, but this is considered a bad practice! Tip: make your parameters final!
		param = 6;
		System.out.println("param:" + param);

		int a = 5; // this is a local variable (function scope), it cannot be accessed outside this method
		System.out.println("a: 5" + a);

		System.out.println("# Block Scope #");
		// anonymous block
		{
			int b = 9;
			System.out.println("a: " + a); // we can access a as expected
			System.out.println("b: " + b);
		}
		// System.out.println("b: " + b); // this won't work, because b is not defined outside the block

	}

	public static void loops() {
		// Loops: let the computer do the work for you! DRY: Don't Repeat Yourself!
		// Loops are also called iteration, verb: to iterate

		// FOR LOOPS
		// variable name i
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("----------------------------------------");

		// loop over items in an array
		String[] strings = { "Hello", " ", "World", ", ", "How", " ", "Are", " ", "You", "?" };
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------");

		// foreach: loop over items in an array, easier
		for (String myString : strings) {
			System.out.print(myString);
		}
		System.out.println();
		System.out.println("----------------------------------------");

		// WHILE LOOPS
		int i = 0;
		while (i < 5) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("----------------------------------------");

		// While loops are mainly useful when you don't know beforehand when a condition will be met
		// For example: Wait for 3 seconds (busy waiting);
		long startTime = System.currentTimeMillis();
		long counter = 0;
		System.out.println("Start counting!");
		while (System.currentTimeMillis() < startTime + 3000) {
			counter++;
		}
		System.out.println("Stop Counting. Counter: " + counter);
		System.out.println("----------------------------------------");

		System.out.println("DO WHILE");
		// DO WHILE
		int j = 0;
		do {
			System.out.println(j + " ");
			j++;
		} while (j < 5);

		// NOTE: DO ... WHILE loops are almost never used
		System.out.println("----------------------------------------");

		// BREAK: preemptively stopping the loop
		System.out.println("BREAK");
		i = 0;
		while (i < 5) {
			System.out.println(i + " ");
			if (i == 3) {
				break;
			}
			i++;
		}
		System.out.println("----------------------------------------");

		// CONTINUE: Skip an iteration
		System.out.println("CONTINUE");
		i = 0;
		while (i < 5) {
			i++;
			if (i == 3) {
				continue;
			}
			System.out.println(i + " ");

		}
		System.out.println("----------------------------------------");

	}

	public static void input() {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println(n);
	}

}