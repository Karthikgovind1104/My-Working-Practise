package com.cntrl;

public class ForLoop_P7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 3 == 0 && count != 2 ) {
				System.out.println(i);
				count++;
			} else {
				System.out.print(i);
			}
			if (i == 9) {
				System.out.print(i + 1);
			}

		}

	}
}
