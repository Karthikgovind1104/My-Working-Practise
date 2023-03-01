package com.cntrl;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the num");
		int num = ref.nextInt();
		
		int arm = num;
		int sum = 0;
		
		while(num>0) {
			
			int a = num%10;
			
			sum = sum + a*a*a;
			
			num = num / 10;
		}
		
		if(arm == sum) {
			System.out.println("armstrong no");
		}
		else {
			System.out.println("not a armstrong no");
		}
	}

}
