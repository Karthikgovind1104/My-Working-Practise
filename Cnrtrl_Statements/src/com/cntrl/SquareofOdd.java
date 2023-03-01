package com.cntrl;

public class SquareofOdd {
	public void Sq() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				int square = i * i;

				System.out.println(square);
			}
		} 

	}

	public static void main(String[] args) {
		SquareofOdd s = new SquareofOdd();
		s.Sq();
	}
}
