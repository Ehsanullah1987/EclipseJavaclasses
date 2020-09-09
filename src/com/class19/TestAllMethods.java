package com.class19;

public class TestAllMethods {
	public static void main(String[] args) {
		// find the largest from 300 and 500
		// then identify is the lagest number is odd
		AllMethods obj=new AllMethods();
		int large=obj.findLargest(300, 500);
		boolean odd=obj.isOdd(large);
		System.out.println(odd);
		// call method weekdayName
		//if(tuesday, wednesday, thursday
		// sunday)---> I am learning java
		String day=obj.weekDayName(5);
		if(day.equals("Tuesday")|| day.equals("Wednesday") || day.equals("Thursday") || day.equals("Saturday")|| day.equals("Sunday")){
				}
	}
}
