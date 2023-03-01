package com.java;

import java.util.Scanner;

public class StuEnrollment {

	public void class1() {
		Scanner sc = new Scanner(System.in);

			System.out.println("Enter the student name");
			String name = sc.nextLine();
			System.out.println("The Student name is : " + name);
			
			
	}

	public static void main(String[] args) {
		StuEnrollment obj = new StuEnrollment();
		obj.class1();
	}

}
