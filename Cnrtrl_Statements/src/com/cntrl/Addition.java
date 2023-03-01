package com.cntrl;

public class Addition {
	
	public String add(int a, int b,String d) {
		String c = "king"; 
		return a+b+c+d;

	}
	public static void main(String[] args) {
		Addition ref = new Addition();
		String add = ref.add(50, 60, "queen");
		System.out.println(add);
	}

}
