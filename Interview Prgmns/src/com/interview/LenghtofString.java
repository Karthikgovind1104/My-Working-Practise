package com.interview;

public class LenghtofString {
public static void main(String[] args) {
	String s = "karthik";
	int length = s.length();
	System.out.println(length);
	
	//      OR
	
	char[] charArray = s.toCharArray();
	int count =0;
	for (char c : charArray) {
		count++;
		
	}
	System.out.println(count);
	
	//        OR
	
	int codePointCount = s.codePointCount(0, count);
	System.out.println(codePointCount);
	
}
}
