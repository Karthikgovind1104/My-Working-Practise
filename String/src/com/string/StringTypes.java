package com.string;

public class StringTypes {
	public static void main(String[] args) {
		
		// Im Mutable string
		System.out.println("****** Im Mutable String*******");
		
		String a = "greens technology";
		String b = "greens technology";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		String concat = a.concat(b);                                // or   a = a.concat(b)     
		System.out.println(System.identityHashCode(concat));        // if a is assumed mentioned above this line becomes //
		System.out.println(System.identityHashCode(a));             // new memory is assumed to a here
		System.out.println(System.identityHashCode(b));
		
		// Mutable String
		System.out.println("******* Mutable String*******");
		
		StringBuilder s1= new StringBuilder("greens");
		StringBuilder s2 = new StringBuilder("greens");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		StringBuilder append = s1.append(s2);
		System.out.println(System.identityHashCode(append));
		System.out.println(a==b);
		System.out.println(s2.reverse());                                // we can also reverse a string using stringbuilder
		
		
	}

}
