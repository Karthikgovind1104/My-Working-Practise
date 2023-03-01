package org.clcn;

import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {               // ascending order and not allows null value
	public static void main(String[] args) {
		
		TreeSet<String> value = new TreeSet<String>();
		
		value.add("karthik");
		value.add("dinesh");
		value.add("dk");
		value.add("A");
		value.add("bird");
		value.add("karthik");
		System.out.println(value);
		
		String first = value.first();
		System.out.println(first);
		
		System.out.println(value.last());
		
	//	System.out.println(value.headSet("dk"));    // 1st upto <dk
		
		//System.out.println(value.tailSet("bird"));   // bird <= last element
	
		System.out.println(value.higher("A"));
		
		System.out.println(value.lower("dk"));
		
		//System.out.println(value.pollFirst());
		
	//	value.pollLast();
	//	System.out.println(value);
		
		System.out.println(value.descendingSet());
	}
}
