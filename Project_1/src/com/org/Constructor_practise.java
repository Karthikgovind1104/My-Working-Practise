package com.org;

class A{
	public A () {
		System.out.println("in A");
	}
	public A (int i) {
		System.out.println(" in int A " +i);
	}
	
}
class B extends A {
	public B () {
		super();
		System.out.println("in B");
	}
	public B(int i) {
		super(4);
		System.out.println("in int B " +i);
	}
}
public class Constructor_practise {
	public static void main(String[] args) {
		
		B var = new B(1);
		
	}

}
