package com.cntrl;

import java.util.Scanner;

public class CountOfNum {
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the num");
		int num = ref.nextInt();
		 
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		System.out.println(count);

	}

}
