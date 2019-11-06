package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		//7 days a week
		// if days is 2 or 4 --->SDLC class
		//if day 6 or 7---> Java Class
		// if day 1 or 5 --->no Classes
		//if day=3--->review class
		int day=2;
		//false OR false---->false
		if(day==2 || day==4) {
			System.out.println("SDLC Class");
			//true OR false--->true
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
			// false OR false--->false
		}else if(day==1 ||day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}
		int size=3;
		if(size<5) {
			System.out.println("Short");
		}else if (size==5 || size<6) {
			System.out.println("Medium");
		}else if(size==6 || size>6) {
			System.out.println("tall");
		}
			
	}

}
