package com.java;

public abstract class Employee {

	public static void eDetails() {                             // method overloading
		System.out.println("employee name : Karthik");
	}

	public void eDetails(int i) {
		System.out.println("Age :" + i);
	}

	public void eDetails(long p, String a) {
		System.out.println("phone no. :" + p);
		System.out.println("address :" + a);
	}

	public abstract void eDetails(String p);                               // partial abstraction

}
