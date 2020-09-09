package com.class38;

public class FinallyBlock {
public static void main(String[] args) {
	String str="Hello";
	try {
		char charter=str.charAt(0);
	//char charter=str.charAt(20); // new StringIndexOutOfBounsException();
	System.out.println(charter);
	
	}catch(ArithmeticException e) {}
	
	}finally {
		System.out.println("I am a finally block");
		
	}
	System.out.println("End of the code");
}
}
