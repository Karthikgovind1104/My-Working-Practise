package com.java;

import java.util.Scanner;

public class Scanner1 {




	private void facebook() {
		// SYNTAX: Scanner refname = new Scanner(System.in);
		// to get the input from the user.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
	    sc.nextLine();                                 // cntrl + 2, l = return value         it becomes "String name = sc.nextline();"
		
	}
	public static void main(String[] args) {                                // top or bottom
		Scanner1 ref = new Scanner1();
		ref.facebook();
	}

}
