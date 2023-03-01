package com.cntrl;

public class CountofEvennos {
	public static void main(String[] args) {
		int num = 100, even = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				even++;
				
			}

		}
		System.out.println(even);
	}

}
