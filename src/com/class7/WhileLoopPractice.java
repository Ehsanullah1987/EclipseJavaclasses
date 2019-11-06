package com.class7;

public class WhileLoopPractice {
public static void main(String[] args) {
	// how to print numbers from 1 to 20
	int i=0;
	while(i<=20) {
		System.out.println(i);
		i++;
	}
	int num=50;
	while(num>=20) {
		System.out.println(num);
		num--;
	}
	System.out.println("---------------");
	// i want to print all even numbers from 1 to 20.
	int z=2;
	while (z<=20) {
		System.out.println(z);
		z+=2;
	}
		// 2 ways using modulus.
	int q=1;
	while(q<=20);
	if(q%2==0) {
		System.out.println(q);
	}
	q++;
}
}
