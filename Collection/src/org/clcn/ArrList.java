package org.clcn;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrList {                    // List --->  Index based and allows duplicate values            List order --> insertion
	
	public static void main(String[] args) {
	// List <Wrapper cls> refName = new Type of List <Wrapper cls>();
		ArrayList <Object> num = new ArrayList<Object>();
		num.add(15);
		num.add('c');
		num.add("he");
		num.add(70.1);
		num.add(80);
		System.out.println("Array list 1 : "+num);
		
		System.out.println(num.size());
		
		Object get = num.get(1);
		System.out.println(get);
		
		num.set(1,'z');
		System.out.println(num);
		
		num.remove(0);
		System.out.println(num);
		
		System.out.println(num.indexOf(70.1));
		
		boolean contains = num.contains('z');
		System.out.println(contains);
		
//		num.clear();                        // clears and makes it empty
//		System.out.println(num);
		
		List <Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(80);
		num1.add(3);
		System.out.println("Array list 2 : "+num1);
		
//		num.addAll(num1);                   // adds both the arraylists
//		System.out.println(num);
		
//		num.removeAll(num1);                // remove the repeated values that appears in both the arraylist
//		System.out.println(num);
		
//		num.retainAll(num1);
//		System.out.println(num);            // prints only the repeated values occurs in both arraylists
		
		// Iterator
		System.out.println("*******Iterator*******");
		
		for (Object it : num) {
			System.out.println("using foreach loop : "+it);
			
		}
		System.out.println("------------------------------");
		for(int i=0; i<=num.size()-1;i++) {
			System.out.println("using for : "+num.get(i));         // use get method
		}
		System.out.println("--------------------------------");
		
		ListIterator<Object> li = num.listIterator();
		while(li.hasNext()) {                                      // using hasNext
			System.out.println(li.next());                         // next
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
