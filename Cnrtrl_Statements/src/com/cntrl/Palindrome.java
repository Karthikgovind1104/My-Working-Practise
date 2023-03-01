package com.cntrl;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner ref = new Scanner(System.in);
		System.out.println("enter the no.");
		int num = ref.nextInt();

		int temp = num;
		int rev = 0, b=0;
        
		// 121>0 -- True
		// 12 > 0 -- T
		// 1>0 -- T
		// 0>0 -- False
		while (num > 0) {
			 b = num % 10;
			// 121%10 = 1
			// b = 12%10 =2
			// 1 % 10 = 1                                   rem = 1 , quotient = 0
            rev = rev*10+b;
            // 0*10= 0+1 = 1
            // 1*10+2 = 12
            // 12*10 + 1 = 121
            num = num/10;
            //121/10 = 12
            // 12/10 = 1
            // 1/10  = 0
		}
		if(temp == rev){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
