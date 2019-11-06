package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		boolean b = true;
		boolean classToday = false;

		if (b) {
			System.out.println("Hello");

			if (classToday) {
				System.out.println("Hello my friends"); 

			}

		} else {
			System.out.println("Bye");

			System.out.println("I am continuing my code");
		}

		boolean isFriday = false;
		int day = 13;
		// if today is friday only day I want to
		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {
				System.out.println("I will wacth a movie");
			}
		} else {
			System.out.println("Today is not Friedy");
		}

	}

}
