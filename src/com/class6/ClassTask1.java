package com.class6;

import java.util.Scanner;

public class ClassTask1 {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Month of born");
	String month;
	month = Scan.nextLine();
	if(month.equals("January") || month.equals("February") || month.equals("March")) {
		System.out.println("Winter");
	}else if(month.equals("April") ||month.equals("May") || month.equals("June")) {
			System.out.println("Spring");
		}else if(month.equals("July") ||month.equals("August") || month.equals("Septepber")) {
			System.out.println("Summer");
		}else {
			System.out.println("Fall");
		}
	}
}

