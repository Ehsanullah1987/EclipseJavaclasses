package com.class6;

public class Recap {
public static void main(String[] args) {
	// declare the time of the day (1-24)
	int time=200;
	String timeOfDay="Morning";
	if(time>=1 && time<=11) {
		timeOfDay="Morning";
	}else if(time>=12 && time<=15) {
		timeOfDay="Noon";
	}else if(time>=16 && time<=20) {
		timeOfDay="Evening";
	}else if(time>=20 && time<=24) {
		timeOfDay="Night";
	}else {
		System.out.println("Unknown");
	}
	System.out.println("Time of the day is "+timeOfDay);
	if(timeOfDay.equals("Morning")) {
		System.out.println("Good Morning");
	}
}
}