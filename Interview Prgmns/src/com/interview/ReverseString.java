package com.interview;

public class ReverseString {
	public void StringBld() {
              StringBuilder s = new StringBuilder("karthik");
              StringBuilder reverse = s.reverse();
              System.out.println(reverse);
              
	}
	public void StringBff() {
		StringBuffer s = new StringBuffer("karthik");
		StringBuffer reverse = s.reverse();
		System.out.println(reverse);
	}
	public void logicmethod() {
		
		String s1 = "karthik";
		String[] split = s1.split("");
		String rev ="";
		
		for(int i =split.length-1; i>=0; i--) {
			rev = rev+split[i];
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		ReverseString ref = new ReverseString();
		ref.StringBld();
		ref.logicmethod();
		ref.StringBff();
	}

}
