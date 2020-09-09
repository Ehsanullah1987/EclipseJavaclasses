package com.class2;

public class CalculationOfBasicMath {
	public static void main(String[] art) {
		// 1. Writ a java porgram to add, subtract, multiply, and divide 2 decimal
		// value. your program should say. "the ____of 2
		// numbers ___and ____ is equal to_____
		double num1, num2, sum;
		num1 = 6.4;
		num2 = 2.2;
		sum = num1 + num2;
		System.out.println(" the sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);

		// 2. Write a program to find the square of the fdnumber 3.9 your program should
		// say"the squar of the ___is___"
		double firstNum = 3.9;
		double secondNum = 3.9;
		double squarNum = firstNum * secondNum;
		System.out.println(squarNum);

		// 3. Write a program to print the area and perimeter of a rectangle with width
		// =5 and height = 8 your program should say. " The
		// perimeter of a rectangle with width ___and height ___is equal to _____ and
		// the area is___"
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);
		System.out.println(" The perimiter of rectangle with width " + width + " and height " + height + " is equal to "
				+ perimeter + " and the area is " + area);
		String Message = " The Perimeter of rectangle with width " + width + "and hieght" + height + " is equal to "
				+ perimeter + "and the area is " + area;

		double d = 12;
		System.out.println(d);

		//int i= 12.5; cannot convert from double

		// modulus gives remaining of the division;

		int a = 15;
		int b = 4;
		System.out.println(a/b);
		int remainder = a % b;
		System.out.println(remainder);
		int myNumber = 8 + 8 * 2;
		System.out.println(myNumber);

	}

}
