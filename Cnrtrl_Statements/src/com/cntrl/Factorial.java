package com.cntrl;

public class Factorial {
	public static void main(String[] args) {                                 // no if condition needed here
		int num = 3;
		long fac = 1l;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}

}
