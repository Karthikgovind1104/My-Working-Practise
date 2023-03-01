package com.java;

interface Demo {
	
	void abc();

	default void show() {
		System.out.println("in show");
	}
}

class InterDemo implements Demo{
	public void abc()
	{
		System.out.println("in abc");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		 InterDemo obj = new InterDemo();
		 obj.abc();
		 obj.show();
	}

}
