package com.java;

public class Method_Overloading {

	public void ticket_details(String name) {
	
		System.out.println("Passenger Name : " + name);
	}
	
	public void ticket_details(float arr, float dep) {
		
		System.out.println("Arrival time : "+ arr );
		System.out.println("Departure time : "+dep);
	}

	public void ticket_details(int a, String add) {
		
		System.out.println("Passenger Age: "+a);
		System.out.println("Address : " +add);
	}
   public static void main(String[] args) {
	
	   Method_Overloading mo = new Method_Overloading();
	   
	   mo.ticket_details("Karthik");
	   mo.ticket_details(12.45f, 12.55f);
	   mo.ticket_details(23, "xyz address");
	   
}
}
