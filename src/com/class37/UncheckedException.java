package com.class37;

public class UncheckedException {
public static void main(String[] args) {
	System.out.println("Beginning of the code");
	int a=20;
	int b=0;
	try{
		System.out.println("code inside try block");
	System.out.println(a/b); //new ArithmeticEception();
	System.out.println("code continues inside try block");
	
 }catch (ArithmeticException e) {//ArithmeticException e=new ArithmeticException();
		System.out.println("I am code inside catch block");
		//e.printStackTrace();
		//System.out.println(e);
		System.out.println(e.getMessage());
	}
	System.out.println("End of the code");
}
}
