package com.example.java.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] numbers = { 100, 200, 300, 400 };
		int result = sumOfArray(numbers);
		System.out.printf("Het resultaat is %d", result);
	}

	public static int sumOfArray(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result + nums[i];
		}

		return result;
	}

}
