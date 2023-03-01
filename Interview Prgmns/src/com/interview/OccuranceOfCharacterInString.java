package com.interview;

import java.util.*;

public class OccuranceOfCharacterInString {
	public static void main(String[] args) {
		String word = "language";
		int count =0;
		char toFind ='a';
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			 
                 if(word.charAt(i)==toFind) {
                	 count++;
                	 
                 }
			}
			System.out.println(count);
		}
		
}
