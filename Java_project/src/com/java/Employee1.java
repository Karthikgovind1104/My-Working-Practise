package com.java;

public class Employee1 extends Employee {                                        // Inheritance

	public Employee1(String e) {                                                 // Constructor
		System.out.println("employee email:" + e);

	}

	public Employee1() {
		this("abc@gmail.com");                                                   // this - current class refName
		System.out.println("Experience : 8 years");
	}

	@Override
	public void eDetails(String p) {                                              
		System.out.println("Password : " + p);

	}

	public static void main(String[] args) {
		eDetails();
		
		Employee1 em = new Employee1();
		
		em.eDetails(45);
		em.eDetails(8484445887l, "xyz");
		em.eDetails("Xyz");
	}

}
