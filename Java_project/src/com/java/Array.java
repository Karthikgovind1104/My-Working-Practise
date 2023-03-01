package com.java;

public class Array {
	public static void main(String[] args) {
		int [] size = {10,20,30,40,50};
		String word [] = {"one,two,three"};      // lenght = 3 , index = 2;
		                                         //  one   two   three    - lenght
                                                 //   0     1      2      -   indices
		
	System.out.println(size[1]);
		System.out.println(size[0]);
		System.out.println(word[0]);        // 0 or 1 or 2 same output for string
		
		
		//                                       //Datatype arrayRefVar[] = new Datatype[size or lenght];
		// for object creation in oops          // classname refName = new classname();
		                                        // Array n = new Array();
		
		int ref[] = new int[3];                     // 3 is lenght of array
		ref[0] = 1;
		ref[1] = 10;
		ref[2] = 19;
		
		System.out.println(ref[2]);              
	}

}
