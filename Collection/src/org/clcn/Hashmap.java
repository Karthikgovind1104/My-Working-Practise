package org.clcn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {  // hash map --->  ramdom order
	
	// Map ---> map< key, value >         key + value = one entry
	// key ---> will not allow duplicate but it overrides  and allow override null
	// value ---> will allow duplicate and allow both null
	
public static void main(String[] args) {
	HashMap<String, Integer> both = new HashMap<>();
	both.put("A", 10);             // entry set 1
	both.put("B", 20);              // B overrides                               entry set 2
	both.put("E", 10);             // duplicate value accepts  10 & 10           entry set 3
	both.put("D", 40);
	both.put("C", 50);
	
	System.out.println(both);
	
	Set<String> keySet = both.keySet();
	System.out.println(keySet);
	
	
//	
//	Collection<Integer> values = both.values();
//	System.out.println(values);
	
	boolean containsKey = both.containsKey("A");
	System.out.println(containsKey);
	
	boolean containsValue = both.containsValue(10);
	System.out.println(containsValue);
	
	Set<Entry<String, Integer>> entrySet = both.entrySet();       // changes to array
	System.out.println(entrySet);
	
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>20) {
			System.out.println(entry);
		}
		
	}
		
	}
}

