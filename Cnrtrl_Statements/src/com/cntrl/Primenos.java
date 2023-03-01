package com.cntrl;

import java.util.Scanner;

public class Primenos {
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the no.");
		byte num = ref.nextByte();
		
		int count=0;
		if(num>1) {
			for(int i =1; i<=num;i++) {
				if(num%i==0)
					count++;
			}
				
				if(count==2) {
					System.out.println("prime number");
				}
				else {
					System.out.println("not a prime number");
				}
			}	
		
	}

}
