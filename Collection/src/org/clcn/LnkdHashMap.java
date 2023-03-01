package org.clcn;

import java.util.LinkedHashMap;
import java.util.Map;

public class LnkdHashMap {             // Insertion order
public static void main(String[] args) {
	Map<Integer, String> emp = new LinkedHashMap<>();
	emp.put(1, "car");
	emp.put(2, "bike");
	emp.put(4, "bike");
	emp.put(3, "train");
	emp.put(1, "flight");         // 1 overrides
	emp.put(null, "f");
	emp.put(null, "zz");
	
	System.out.println(emp);
	
}
}
