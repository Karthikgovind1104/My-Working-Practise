package com.cntrl;

import java.util.Scanner;

public class Standard {
	
	private void class1() {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the age");
		byte age = ref.nextByte();
		
		if(age==5){
			System.out.println("he is eligible for cls1");
		}
		else if(age==6) {
			System.out.println("he is eligible for cls2");
		}
		else if (age==7) {
			System.out.println("he is eligible for cls3");
		}
		else if(age==8) {
			System.out.println("he is eligible for cls4");
		}
		else if (age==9) {
			System.out.println("he is eligible for cls5");
		}
		
		else {
			System.out.println("he is not eligible");
		}
		
	}
	public static void main(String[] args) {
		Standard obj = new Standard();
		obj.class1();
	}
	

}
