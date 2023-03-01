package org.clcn;
import java.util.*;
import java.util.LinkedList;

public class LnkdList {                                    // Insertion and deletion is easy
	public static void main(String[] args) {
		LinkedList <Integer> num = new LinkedList<Integer>();
		num.add(10);
		num.add(250);
		num.add(750);
		num.add(250);
		
		System.out.println(num);
		
		num.addFirst(15);
		System.out.println(num);
		
		num.addLast(100);
		System.out.println(num);
		
//		num.removeFirstOccurrence(250);
//		System.out.println(num);
		
		num.removeLastOccurrence(250);
		System.out.println(num);
		
		num.poll();                         // removes first value
		System.out.println(num);
		
		num.pollLast();                      // removes last value
		System.out.println(num);
	}

}
