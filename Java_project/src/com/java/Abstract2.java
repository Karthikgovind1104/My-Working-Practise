package com.java;

public class Abstract2 extends Abstract1 {
	
	@Override
	public void password() {
		
		System.out.println("Priya");
		
	}

	public static void main(String[] args) {
		Abstract2 ab = new Abstract2();
		ab.password();
		ab.usermailid();
		
	}
}
