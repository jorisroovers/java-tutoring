package com.example.java.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		// diamond operator:
		HashMap<String, Integer> myHashMap2 = new HashMap<>();
		// assigning to more generic types
		Map<String, Integer> myMap = new HashMap<>();

		System.out.println("myMap.put(\"hallo\", 1234): " + myMap.put("hallo", 1234));
		System.out.println("myMap.get(\"hallo\"): " + myMap.get("hallo"));
		System.out.println("myMap.put(\"hallo\", 12345): " + myMap.put("hallo", 12345));
		System.out.println("myMap.containsKey(\"hallo\"): " + myMap.containsValue("hallo"));
		System.out.println("myMap.containsValue(12345): " + myMap.containsValue(1234));
		System.out.println("myMap.put(\"foo\", 123): " + myMap.put("foo", 123));
		System.out.println("myMap.isEmpty(): " + myMap.isEmpty());
		System.out.println("myMap.size(): " + myMap.size());
		System.out.println("myMap.values():" + myMap.values());
		System.out.println("myMap.keySet(): " + myMap.keySet());
		System.out.println("myMap.replace(\"foo\", 999): " + myMap.replace("foo", 999));
		System.out.println("myMap.get(\"foo\"): " + myMap.get("foo"));

		System.out.println("myMap.remove(\"foo\"): " + myMap.remove("foo"));
		System.out.println("myMap.keySet(): " + myMap.keySet());
		myMap.clear();
		System.out.println("myMap.clear()");

	}

}
