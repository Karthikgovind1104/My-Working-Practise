package org.clcn;
import java.util.*;
public class Hashset {          // Hashset --> Random order    // Set --->  value based and does not allow duplicate value
	public static void main(String[] args) {
		
	HashSet<Integer> num = new HashSet<Integer>();
	
		num.add(11);
		num.add(222);
		num.add(11);
		num.add(98);
		num.add(50);
		num.add(null);
		System.out.println(num);
		
		System.out.println("-----------------------");
		
		for (Integer in : num) {
			System.out.println(in);
		}
		System.out.println("-----------------------");
		
         Iterator<Integer> in = num.iterator();
         while(in.hasNext()) {
        	 System.out.println(in.next());
         }
		}
	}


