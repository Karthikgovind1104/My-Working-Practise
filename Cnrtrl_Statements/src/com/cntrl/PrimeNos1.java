package com.cntrl;

public class PrimeNos1 {
	public static void main(String[] args) {
		
		for (int i =2; i<=50; i++) {                   // 2/ no 
			int count =0;
			for (int j = 2; j < i; j++) {
				if(i%j ==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("prime no "+i);
			}
//			else {
//				System.out.println("not a prime no "+i);
//			}
		}
	}

}
