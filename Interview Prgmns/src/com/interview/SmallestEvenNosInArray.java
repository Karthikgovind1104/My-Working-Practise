package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestEvenNosInArray {
	public static void main(String[] args) {

		int num[] = { 50, 10, 40, 6, 3, 1000, 5, 1, 200 };
		ArrayList <Integer> arr = new ArrayList<>();
		for(int i =0; i<num.length; i++) {
			if(num[i] %2==0) {
				arr.add(num[i]);
			}
		}
		System.out.println(arr);
		Collections.sort(arr);
		System.out.print(arr.get(0));
	}
}
