package com.example.java.iteration;

public class While {

	public static void main(String[] args) {
		simpleWhile();
		// usefulWhile();
	}

	public static void simpleWhile() {
		System.out.println("While.simpleWhile()");
		// WHILE LOOPS
		int i = 0;
		while (i < 5) {
			System.out.print(i + " ");
			i++;
		}

	}

	public static void usefulWhile() {
		System.out.println("While.usefulWhile()");
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
	}

}
