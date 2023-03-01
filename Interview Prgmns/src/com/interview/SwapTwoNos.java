package com.interview;
import java.util.*;

public class SwapTwoNos {
	private void byUsingThridVariable() {
		int mySalary = 20;
		int superiorSalary = 50;
		System.out.println("before swapping " + "mine :" + mySalary + " superior :" + superiorSalary);

		int temp = mySalary;
		mySalary = superiorSalary;
		superiorSalary = temp;

		System.out.println("before swapping " + "mine :" + mySalary + " superior :" + superiorSalary);

	}
	private void usingArithmeticOperations() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no");
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	
//	num1 = num1-num2;                         //  12- 10= 2
//	num2 = num1+num2;                          //  2+10=12
//	num1 = num2-num1;                          // 12-2 = 10
//	
	num1 = num1*num2;                         // 30*20= 600
	num2 = num1/num2;                         // 600/20= 30
	num1 = num1/num2;                         // 600/30 = 20
	
	System.out.println(num1 + "  "+ num2);
	}
	
	public static void main(String[] args) {
		SwapTwoNos ref = new SwapTwoNos();
		ref.byUsingThridVariable();
		ref.usingArithmeticOperations();
	}
}
