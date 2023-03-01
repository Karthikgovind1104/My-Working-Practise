package com.interview;

public class ReverseTheWords {
	private void words() {
		String s = "karthik is a great man";
		String[] split = s.split(" ");
		String rev = "";
		System.out.println(split.length);
		
		for(int i=split.length-1;i>=0;i--) {
			rev = rev+split[i]+" ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		 ReverseTheWords ref = new  ReverseTheWords();
		 ref.words();
	}
}
