package com.java;

public class Method_Ovrr_phonepe extends Method_ovrr_Gpay {
	
@Override
public void payment() {
	
	//super.payment();
	
	System.out.println("9000");
	
}

public static void main(String[] args) {
	
	 Method_Ovrr_phonepe m = new  Method_Ovrr_phonepe();
	 
	 m.payment();
	 m.payment1();
}
	

}

