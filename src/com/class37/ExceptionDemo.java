package com.class37;

public class ExceptionDemo {
public static void main(String[] args) {
	division2Intergers(10,5);
	division2Intergers(10,0);
	division2Intergers(10, 0);
	division2Intergers(10, 5);
	division2Intergers(10, 3);
}
public static void division2Intergers(int num1, int num2) {
	try {
		System.out.println(num1/num2);
	}catch(ArithmeticException e ) {
		System.out.println(" Cannot divide by zero, please provide valid number");
		System.out.println(e.getMessage());
	}
	
}
}
