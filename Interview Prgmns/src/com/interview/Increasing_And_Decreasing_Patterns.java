package com.interview;

public class Increasing_And_Decreasing_Patterns {
	public static void main(String[] args) {
		int num = 8;
		for(int i =1; i<=8; i++) {
			for(int j= i; j<=i; j++) {
				System.out.print(i);
				if(i==2||i==7) {
					System.out.print("#");
				}
				if(i==3||i==6) {
					System.out.print("#"+i);
				}
				if(i==4||i==5) {
					System.out.print("#"+i+"#");
				}
			}
			System.out.println();
		}
	}
}
