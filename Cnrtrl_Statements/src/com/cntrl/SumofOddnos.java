package com.cntrl;

public class SumofOddnos {
	public static void main(String[] args) {
		int num=100,sum=0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum = sum+i;
			}
		
		}	
		System.out.println(sum);
	}
}
