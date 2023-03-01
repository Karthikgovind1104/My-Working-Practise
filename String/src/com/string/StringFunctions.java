package com.string;

public class StringFunctions {
	public static void main(String[] args) {
		
		String one = "greens technology";
		String two = "Greens Technology";
		String three = " ";
		
		int length = one.length();
		System.out.println(length);
		
		boolean equals = one.equals(two);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = one.equalsIgnoreCase(two);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = one.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = two.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = one.startsWith("G");
		System.out.println(startsWith);
		
		boolean endsWith = one.endsWith("y");
		System.out.println(endsWith);
		
		boolean contains = one.contains("gren");
		System.out.println(contains);
		
		int indexOf = one.indexOf('n');
		System.out.println(indexOf);
		
		int lastIndexOf = one.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		char charAt = one.charAt(1);
		System.out.println(charAt);
		
		String replace = one.replace("technology", "world");
		System.out.println(replace);
		
		String substring = one.substring(4);
		System.out.println(substring);
		
		String substring1 = one.substring(1, 5);
		System.out.println(substring1);
		
		boolean empty = three.isEmpty();
		System.out.println(empty);
		
		String trim = three.trim();
		System.out.println(trim);
	}

}
