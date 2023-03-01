package com.interview;

import java.util.Scanner;

public class RepeatingCharacters {
	public static void main(String[] args) {
		
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the word");
//	String s = sc.next();
		String s = "commerce";
		
	int count = 0;
	for(int i=0; i<s.length(); i++) {
		for(int j =i+1; j<s.length(); j++) {
			if(s.charAt(i) == s.charAt(j)) {
				System.out.print(s.charAt(i));
				
				count = 1;
				break;
			}
		}
		if(count == 1) {
			break;
		}
	}
}
}