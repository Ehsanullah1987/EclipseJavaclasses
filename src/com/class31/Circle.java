package com.class31;

class Circle implements Shape {

	@Override
	public void calculateArea(double a) {
		
		System.out.println(3.14*a*a);
		
	}

	@Override
	public void calculatePerimiter(double a) {
		
		System.out.println(2*a*a);
		
	}

}
