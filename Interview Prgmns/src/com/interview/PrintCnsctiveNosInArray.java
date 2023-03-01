package com.interview;

import java.util.ArrayList;

public class PrintCnsctiveNosInArray {
	public static void main(String[] args) {
		int[] num = { 7, 4, 6, 9, 1, 2, 3, 4, 30, 40, 32 };
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if ((num[i] +1) == num[j] && !arr.contains(num[i])) {
					arr.add(num[i]);
					arr.add(num[j]);
				}
			}
		}
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
