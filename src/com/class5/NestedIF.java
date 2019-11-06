package com.class5;

public class NestedIF {
	public static void main(String[] args) {
		boolean isDisplayed = true;
		String buttonText = "Sign In";
		if (isDisplayed) {
			System.out.println("Button is dispayed");
			if (buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Worng text is displayed");
			}
		} else {
			//System.out.println("Button is not displayed");
		}
		// 7 days a week
		// if days ie tuesday or Thursday-->SDLC class
		// if days Saturday OR sunnday-->Java Class
		// if day monday or firday-->No class
		// if day is Wednesday--->review class
		String WeekDay = "Wednesday";
		if (WeekDay.equals("Tuesday") || WeekDay.contentEquals("Thursday")) {
			System.out.println("SDLC Class");
		} else if (WeekDay.equals("Saturday") || WeekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if(WeekDay.equals("Manday") || WeekDay.contentEquals("Friday")){
			System.out.println("No class");
		}else if(WeekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}
		
	}
}
