package org.clcn;

public class Variable {
	// cls variable

	int a = 100;

	public void add() {
		// local variable
		int b = 50;
		System.out.println(a + b);

	}

	private void sub() {
		int c = 80;
		System.out.println(a - c);

	}

	public static void main(String[] args) {

		Variable ref = new Variable();
		System.out.println(ref.a);
		ref.add();
		ref.sub();
	}
}
