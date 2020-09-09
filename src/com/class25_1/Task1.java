package com.class25_1;

public class Task1 {

	public static void method() {
		System.out.println("I am not lost so for at Java language");
	}
	public static void method(String str) {
		System.out.println("This is method with the String para "+str);
	}
	public static void method(int num1) {
		System.out.println("This is the method with the number para "+num1);
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.method();
		obj.method("java");
		obj.method(10);
		Task1 obj1=new Task1();
		obj1.m();
		obj1.m(1);
	}

		

	private void m() {
		System.out.println("This is private Type of method");
	}
	private void m(int num1) {
		System.out.println("This is private method with the number parameter");
	}
}
