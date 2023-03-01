package com.java;

public class Array_practise2 {                                  // jagged array - not same no of columns of diff rows  
	                                                            // 2 D array - same no. of columns
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},{2,4,6},{5,6,7,8,9}};
		 
		for(int i=0; i<3; i++) {                                     // instead of i<3 - i<a.lenght        // 3 is array lenght
			
			for(int j=0; j<a[i].length; j++) {                       
			
				System.out.print(" "+a[i][j]);
			}
			
			System.out.println();
		}
	
	}
}
