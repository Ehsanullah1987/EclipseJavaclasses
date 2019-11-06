package com.class7;

public class DoWhile {
public static void main(String[] args) {
	//mostly use
	int num=10;
	while(num<=7) {
		System.out.println("Hello");
		num++;
	}
	//rarely use.
	int num1=10;
	do {
		System.out.println("Bye");
		num1++;
	}while(num1<=7);
	System.out.println("-------------------");
	// 
	int num2=20;
	do {
		System.out.println(num2);
		num2+=2;
	}while( num2<=50);
		System.out.println(num2);
		
	}
}

