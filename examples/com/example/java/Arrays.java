package com.example.java;

public class Arrays {

	public static void main(String[] args) {
		simpleArrays();
		// multiDimensional();
	}

	public static void simpleArrays() {

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

	}

	public static void multiDimensional() {
		// Nested arrays, also called multi-dimensional arrays
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

}
