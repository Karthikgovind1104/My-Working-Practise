package com.java;

import java.util.Scanner;

public class GetTheInputScanner {

	public static void main(String[] args) {                        // top or bottomf
		GetTheInputScanner ref = new GetTheInputScanner();
		ref.facebook();
	}

	private void facebook() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println(" the user name is :" + name);

		System.out.println("enter the age");
		sc.nextByte();
		

		System.out.println("enter the weight");
		float weight = sc.nextFloat();
		System.out.println("the weight is :" + weight);

		System.out.println("particular character in string");
		char any = sc.next().charAt(1);                              // cntl+2,l       here 1 is index
		System.out.println(any);

	}

}
