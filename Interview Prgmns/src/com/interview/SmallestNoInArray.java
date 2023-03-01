package com.interview;

import java.util.Arrays;

public class SmallestNoInArray {
	
	// int num[] = new int[3];
	int num[] = { 10, 45, 9, 67, 90 };


	private void findSmallest() {

	
		int smallest = num[0];
		// OR int smallest = Integer.MAX_VALUE;

		for (int i = 0; i <= num.length - 1; i++) {
			if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println(smallest);

	}
	private void usingArray() {
		
		Arrays.sort(num);                           // sort is ascending order
		System.out.println(num[0]);

	}

	public static void main(String[] args) {
		SmallestNoInArray ref = new SmallestNoInArray();
		ref.findSmallest();
		ref.usingArray();

	}
}
