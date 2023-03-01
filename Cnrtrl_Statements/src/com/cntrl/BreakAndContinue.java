package com.cntrl;

public class BreakAndContinue {                                                   // for each loop
	public static void main(String[] args) {
//		int a []= {10,20,30,40};
//		for(int i : a) {
//			
//			System.out.println(i);
//		}
//		for(int i =0; i<a.length; i ++) {                     // for loop
//			System.out.println(a[i]);
//		}
		for (int i=0; i<=10; i++) {
			if(i==5) {
				continue;                                      // break or continue(jumping stmt)
			}
			else {
				System.out.println(i);
			}
		}
	}

}
