package com.example.java.methods;

import com.example.java.pojo.Person;

public class Parameters {

	public static void main(final String[] args) {
		int x = 10;
		Parameters.assignByValue(x);
		System.out.println("After Parameters.assignByValue(x): " + x);
		System.out.println();

		// Objects are assigned by reference, not by value!
		Person person = new Person("John", 43);
		Parameters.assignByReference(person);
		System.out.println("After Parameters.assignByReference(person): " + person);
		System.out.println();

		// Arrays are also passed by reference
		// details:
		// http://stackoverflow.com/questions/12757841/are-arrays-passed-by-value-or-passed-by-reference-in-java
		int[] myArray = { 2, 4 };
		System.out.print("myArray (before call to assignArray): ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		assignArray(myArray);
		System.out.print("myArray (after call to assignArray): ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		System.out.println();

		// Method overloading. Same method name, but different method. Actual method that is called is determined based
		// on parameter type.
		Parameters.add(5, 6);
		System.out.println();
		Parameters.add(5.0, 6.0);

		// TODO(joris.roovers): ellipsis

	}

	public static void assignByValue(int x) {
		System.out.println("Parameters.assignByValue()");
		System.out.println("x: " + x);
		x += 5;
		System.out.println("x: " + x);
	}

	public static void assignByReference(Person person) {
		System.out.println("Parameters.assignByReference()");
		System.out.println("person: " + person);
		person.setName("Lisa");
		System.out.println("person: " + person);
	}

	public static void assignArray(int[] myArray) {
		myArray[0] = 5;
		myArray[1] = 10;
		System.out.print("myArray (in assignArray): ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

	public static int add(int a, int b) {
		System.out.println("Parameters.add(int, int)");
		return a + b;
	}

	public static double add(double a, double b) {
		System.out.println("Parameters.add(double, double)");
		return a + b;
	}

}
