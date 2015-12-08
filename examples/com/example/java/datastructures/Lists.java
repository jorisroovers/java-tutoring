package com.example.java.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Lists {

	public static void main(final String[] args) {

		instantiation();

		operations();

	}

	public static void instantiation() {
		System.out.println("Lists.instantiation()");
		final ArrayList<Integer> myList = new ArrayList<Integer>();

		// only use the interface
		final List<Integer> myList2 = new ArrayList<Integer>();

		// diamond operator: Java 7 and up
		final List<Integer> myList3 = new ArrayList<>();

		// other types
		// LinkedList -> FIFO
		final List<Integer> myList4 = new LinkedList<>();

		// Stack -> FILO
		final List<Integer> myList5 = new Stack<>();
	}

	public static void operations() {
		System.out.println("Lists.operations()");
		// Create a list of integers
		final ArrayList<Integer> myList = new ArrayList<Integer>();

		System.out.println("myList.isEmpty(): " + myList.isEmpty());

		// put some numbers in it
		for (int i = 0; i <= 100; i += 2) {
			myList.add(i);
		}

		System.out.println("myList: " + myList);
		System.out.println("myList.isEmpty(): " + myList.isEmpty());
		System.out.println("myList.size(): " + myList.size());
		// set() returns the value that was previously set at the specified index
		System.out.println("myList.set(20, 999): " + myList.set(20, 999));
		System.out.println("myList.get(20): " + myList.get(20));
		System.out.println();

		System.out.println("Removing some elements from the list");
		myList.remove(0); // remove first element
		System.out.println("myList: " + myList);
		myList.remove(10); // remove 11th element
		System.out.println("myList: " + myList);
		myList.remove(myList.size() - 1); // remove last element
		System.out.println("myList: " + myList);
		System.out.println();

		System.out.println("# Membership #");
		System.out.println("myList.contains(40): " + myList.contains(40));
		System.out.println("myList.contains(41): " + myList.contains(41));
		System.out.println("myList.indexOf(40): " + myList.indexOf(40));
		System.out.println();

		System.out.println("# Sublist #");
		final List<Integer> subList = myList.subList(3, 10);
		System.out.println("myList.subList(3, 10): " + subList);
		// Note that a sublist is just a "view" of the original list, modifying the view also modifies the orginal list
		subList.set(0, 888);
		System.out.println("myList: " + myList);
		System.out.println();

		System.out.println("# Clearing the list #");
		myList.clear();
		System.out.println("myList: " + myList);
		System.out.println();

	}

}
