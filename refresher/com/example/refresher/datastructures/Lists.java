package com.example.refresher.datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(final String[] args) {
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

		System.out.println("myList.contains(40): " + myList.contains(40));
		System.out.println("myList.contains(41): " + myList.contains(41));

		// TODO(joris.roovers): other types of lists
		
	}
}
