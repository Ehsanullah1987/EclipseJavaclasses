package com.class2;

public class VarriableDeclarion {
public static void main(String[]arg) {
	//1. declaring vaable num1 that will hold value of int and 
	//assigning value of 123 to it
	int num1= -125;
	int num2= 6767;
	long num3= 7879454545l;
	char num4='A';
	
	
	
	//2. declare variable first and then assign value
	int n1;
	int n2;
	int n3;
	
	n1= 5;
	n2= 7676;
	n3= 767;
	
	//3. declare all variable together and then assign value
	int number1, number2, number3;
	number1= 12;
	number2= 15;
	number3= 20;
	System.out.println(number1);
	// declaration happens once in declaring.
	number3=1000;
	System.out.println(number3);
	boolean var=true;
	System.out.println(var);
	// declare assign and then print if you do not declare and assign something ot the variable the print will not work.
	char myVariable;
	myVariable='*';
	System.out.println(myVariable);
	//
	number2=number1; //12
	System.out.println(number2);
	
	//number2= false; -->compile time error asking to change datatype of variable number2 to boolean.	
	boolean isRain=false;
	boolean isSnow=true;
	isSnow = isRain;// isSnow=flase
	System.out.println(isSnow);
	
	isSnow=true;
	System.out.println(isSnow);
	
	
	
}
}
