package com.class3;

public class relationalOperators {
	public static void main(String[]args) {
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num2>num1);
		System.out.println("--------------------");
		double d=.99;;
		
		double d1=2.99;
		boolean b=d>d1;
		System.out.println(b); //false
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3= d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);// false
		System.out.println(b3);//true
		System.out.println("#####################");
		
		int a=90;
		int b4=30;
		// if number a is bigger than number b
		// i Want to print a is larger than b
		if(a>b4) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
		}
		
		
		
		
		
				
	}

}
