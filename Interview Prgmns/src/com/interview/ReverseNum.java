package com.interview;

public class ReverseNum {
	public static void main(String[] args) {
		
		int n = 409;
		int rev = 0;
		while(n>0) {
			int a = n%10;       // 409%10 = 9              40%10 = 0                4%10=4
			rev = rev*10+a;          // 0*10+9= 9          9*10+0 = 90              90*10+4=904
			n = n/10;           // 409/10 = 40             40/10 =4                  4/10= 0
		}
		System.out.println(rev);
	}

}
