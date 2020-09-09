package com.class31;
public class Task {

	public static void main(String[] args) {
//		1. Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
//		Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. Test your code.
		Square sqr = new Square();
		System.out.println(sqr.calculateArea(2, 2));
		System.out.println(sqr.calculatePerimiter(2, 2));
		Square cir = new Circle();
		System.out.println(cir.calculateArea(3.1416, 4)*4);
		System.out.println(cir.calculatePerimiter(2, 8));
	}
}
interface Shape{
	double calculateArea(double a, double b);
	double calculatePerimiter(double x, double y);
}
class Circle implements Shape {
}
	@Override
	public double calculateArea(double a, double b) {
		return a*b;
		
	}
	@Override
	public double calculatePerimiter(double x, double y) {
		return x*y;
	}	
}
class Square implements Shape1 {


	@Override
	public double calculateArea(double a, double b) {
		return a*b;
		
	}

	@Override
	public double calculatePerimiter(double x, double y) {
		return x*y;	
	}
}

