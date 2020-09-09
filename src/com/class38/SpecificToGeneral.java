package com.class38;

public class SpecificToGeneral {
public static void main(String[] args) {
	int num1=10; int num2=0; 
	int result;
	try {
		result=num1/num2;  // new ArithmeticException();
		System.out.println(result);
		Thread.sleep(5000);  //new InerruptedException();
	//}catch(Exception e) { CE unreachable code // or because of general to specific.
	//	System.out.println("Catching all types of exception");
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("Please do not pass us as a second number");
	}catch(InterruptedException e) {
		System.out.println("someone interrupted program sleep");
}
}
}