package com.cntrl;

public class Fibanocci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0, num = 8;
		System.out.print(n1 + " " + n2);
		for (int i = 1; i <= num; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
			//System.out.print(" " + sum);
		}
	}
}
