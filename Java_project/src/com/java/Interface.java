package com.java;

public class Interface implements Employee_Details {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("priya");
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("18");
		
	}

	@Override
	public void gender() {
		// TODO Auto-generated method stub
		System.out.println("female");
		
	}
	public static void main(String[] args) {
		
		Interface in = new Interface();
		in.name();
		in.age();
		in.gender();
	}
	
	

}
