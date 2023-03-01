package com.string;

public class StringReverse {
	public static void main(String[] args) {
		String one = "Malayalam";
		String[] split = one.split("");
		String rev="";

		for (int i = split.length - 1; i >= 0; i--) {

			rev = rev + split[i];

		}
		System.out.println(rev);
		
		
		if (rev.equalsIgnoreCase(one)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
