package org.clcn;

import java.util.TreeMap;

public class Treemap {    // ascending order  and not allows null key
public static void main(String[] args) {
	TreeMap<String, String> emp = new TreeMap<>();
	emp.put("A", "ac");
	emp.put("car", "ab");
	emp.put("bike", "aa");
	emp.put("door", "aqq");
	emp.put("a", "aa");
	System.out.println(emp);
}
}
