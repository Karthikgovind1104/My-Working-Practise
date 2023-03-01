package com.java;

public class Array1 {
	public  String[] empDetails() {
		String employee[] = new String[5];
		employee[0] = "suresh";
		employee[1] = "mani";
		employee[2] = "ramesh";
		employee[3] = "vj";
		employee[4] = "vimal";
		return employee;
	
	}
	 public static void main(String[] args) {
		 Array1 arr = new Array1();
		 String S[] = arr.empDetails();
		 for(int i=0; i<S.length; i++) {
			 System.out.println(S[i]);
		 }
		 
	}

}
