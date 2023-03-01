package com.both;

public class Oops_1 extends Oops {

	private void tyre() {

		System.out.println("MRF");
	}

	public void train() {

		System.out.println("Express");
	}

	public static void flight() {
		System.out.println("Spicejet");
	}

	public static void main(String[] args) {

		car();
		flight();
		// clsName refName = new clsName();

		Oops_1 cc = new Oops_1();
		cc.tyre();
		cc.studentRoll();
		cc.train();
		cc.flight();
		cc.studentRoll(868);

	}
}
