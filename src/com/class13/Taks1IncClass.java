package com.class13;

import java.util.Scanner;

public class Taks1IncClass {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your class day::");
	String day=scan.nextLine();
	if(day.trim().equalsIgnoreCase("saturday")) {
		System.out.println("Saturday is our Java Class");
	}else if(day.equals("Sunday")){
		System.out.println("Sunday is your Git Class");
	}else if(day.toUpperCase().equals("TUSEDAY")) {
		System.out.println("Tuseday is you SDLC class");
	}else if(day.toLowerCase().equals("thrusday")) {
			System.out.println("Thrusday is manual testing class");
	}else {
		System.out.println("Envalid Entry!! Please enter a valid class day");
	}
	scan.close();
}
}
