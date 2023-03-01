package org.clcn;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LnkdHashSet {                 // Insertion order
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		
		num.add(10);
		num.add(null);
		num.add(85);
		num.add(700);
		num.add(10);
		
		System.out.println(num);
		
		Iterator<Integer> in = num.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
	}

}
