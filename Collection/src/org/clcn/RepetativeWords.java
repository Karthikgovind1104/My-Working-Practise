package org.clcn;

import java.util.*;
import java.util.Map.Entry;

public class RepetativeWords {
	public static void main(String[] args) {
         String s = "by the people of the people for the people";
         String[] split = s.split(" ");
         
         Map<String , Integer> map = new LinkedHashMap<>();
         
         for (String word : split) {
        	 if(map.containsKey(word)) {
        		 Integer in = map.get(word);
        		 map.put(word, in+1);
        	 }
        	 else {
        		 map.put(word, 1);
        	 }
		}
         System.out.println(map);
         
         Set<Entry<String, Integer>> entrySet = map.entrySet();
         System.out.println(entrySet);
         
         for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}
}
