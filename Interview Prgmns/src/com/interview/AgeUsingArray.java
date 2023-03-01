package com.interview;

import java.util.ArrayList;

public class AgeUsingArray {
	
	static int age[] = { 10, 20, 30, 40, 15, 8, 50, 60 };
	static int count = 0;
	static int child = 0;
		public static void normal(){
		
		
		for (int i = 0; i < age.length; i++) {
			if (age[i] < 18) {
				// System.out.println("children : "+age[i]);
				child++;
			} else {
				// System.out.println("adult : "+age[i]);
				count++;
			}
		}
		System.out.println("children : "+child);
		System.out.println("adult : "+count);
		}
	
		public static void main(String[] args) {
				normal();
		}
	}


