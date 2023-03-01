package com.string;

public class StringSplit {
	public static void main(String[] args) {
		
//		String one = "Tamil";
//        String[] split = one.split("");
        
        String one = "Tamil is a language";
        String[] split = one.split("");             
        String[] split1 = one.split(" ");                       // " "  --> takes the index . example tamil = 0, is = 1, a = 2, language =3
        
        for(int i =0; i<split.length; i++) {
        	System.out.println(split[i]);
        }
        System.out.println();
        
        for(int i = split.length-1; i>=0; i--) {
        	System.out.print(split[i]);
        }
        System.out.println();
        
        for(int i = split1.length-1; i>=0; i--) {
        	System.out.println(split1[i]);
        } 
	}
}