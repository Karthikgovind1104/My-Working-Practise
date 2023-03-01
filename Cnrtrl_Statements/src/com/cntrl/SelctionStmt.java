package com.cntrl;

import java.util.Scanner;

public class SelctionStmt {
	private void singleCondt() {
		int a = 15;
		if(a<=18) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	private void singleConditionStmnt() {
		
		Scanner ref = new Scanner(System.in);                             // to get input from user
		System.out.println("enter the age");
		byte age = ref.nextByte();
		
		if(age>=18)
			System.out.println("he is eligible");
		else
			System.out.println("he is not eligible");
	}
	
	private void doubleCondtionstmnt() {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the age");
		byte age = ref.nextByte();
		
		System.out.println("enter the weight");
		float weight = ref.nextFloat();
		
		if(age>=18)
			System.out.println("he is eligible");
		else
			System.out.println("he is not eligible");
		
		if(weight<=60) {
			System.out.println("normal person");
		}
		else {
			System.out.println("overweight");
		}
		
	}
	
	private void nestedIf() {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the age");
		byte age = ref.nextByte();
		
		System.out.println("enter the weight");
		float weight = ref.nextFloat();
		
		if(age>=18) {                                          // whether the condition fails in the 1st statement ,it directly jumps to else
			if(weight<=60) {
				System.out.println("normal person");           // the cndt fails above ,it doesnt enter the nested condtion. doesnt enter weight
			}
			else {
				System.out.println("overweight");              // if age cndtn true, it enters the weight and prints it first and then age
			}
			System.out.println("he is eligible");
		}
		else {
			System.out.println("he is not eligible");
		}
	}
	public static void main(String[] args) {
		SelctionStmt s = new SelctionStmt();
		//s.singleCondt();
		//s.singleConditionStmnt();
		//s.doubleCondtionstmnt();
		s.nestedIf();
	}

}
