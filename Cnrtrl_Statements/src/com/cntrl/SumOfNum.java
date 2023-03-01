package com.cntrl;

import java.util.Scanner;

public class SumOfNum { 
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the num");
		int num = ref.nextInt();
		
		int sum =0;
		while(num>0) {
			int a = num%10;
			//12%10 = 2
			//1%10 = 1
			
			sum = sum + a;
			// 0+2 = 2
			// 1+2 = 3
			
			num = num/10;
			//12/10 = 1
		}
		System.out.println(sum);
	}

}
