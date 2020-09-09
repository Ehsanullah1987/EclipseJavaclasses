package com.class31;

class Square implements Shape {

	@Override
	public void calculateArea(double x) {
		
		System.out.println(x*x);
		
	}

	@Override
	public void calculatePerimiter(double x) {
		
		System.out.println(4*x);
		
	}

}
