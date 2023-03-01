package com.interview;

import java.util.*;

public class PositionOfEnglishAlphbt {
	public static void main(String[] args) {
		// 97 ---> a       65 ---> A      Ascii value
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the alphabet");
		char charAt = scanner.next().charAt(0);
		
		charAt = Character.toLowerCase(charAt);
		int asciiValue = (int) charAt;
		System.out.println(asciiValue);
		
		int position = asciiValue-96;
		
		System.out.println(position);

	}

}
