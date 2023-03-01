package com.string;

public class StringChangeIndexPos {
	public static void main(String[] args) { // string array is index based
		String one = "Tamil is a Language";
		String[] split = one.split(" ");

		String rev = "";

		for (int i = 1; i < split.length - 1; i++) {
			rev = rev + split[i] + " ";
		}
		System.out.println(rev);

		System.out.println();

		String changeIndexPosition = split[3] + " " + rev + split[0];
		System.out.println(changeIndexPosition);
	}

}
