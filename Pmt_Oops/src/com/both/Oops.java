package com.both;

public class Oops {

	private void studentName() {

		System.out.println("student name is : arun ");
	}

	public void studentRoll() {

		System.out.println("studentroll is : 56 ");

	}

	public void studentRoll(int a) {
		
		System.out.println("studentRoll is :" + a);
	}

	public static void car() {

		System.out.println("i20");

	}

	public static void main(String[] args) {

		car();
		// clsName refName = new clsName();

		Oops c = new Oops();
		c.studentName();
		c.studentRoll();
		c.studentRoll(6565);
	}
}
