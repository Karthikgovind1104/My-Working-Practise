package com.cntrl;

import java.util.Scanner;

public class ReverseOfNum {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the num");
		int num = ref.nextInt();
		
		int rev =0;
		
		while(num>0) {
			
			int a = num%10;
			//123%10 = 3
			//12 % 10 = 2
			// 1%10 = 1
			
			 rev = rev*10+a;
			 //0*10 + 3 = 3
			 // 3*10 + 2 = 32
			 //32*10 + 1 = 321
			 
			 num= num/10;
			 // 123/10 = 12
			 //12/10 = 1
			 // 1/10 = 0
		}
		System.out.println(rev);
                                                           
	}
}