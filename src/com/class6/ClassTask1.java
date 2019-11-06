package com.class6;

import java.util.Scanner;

public class ClassTask1 {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Month of born");
	String month;
	month = Scan.nextLine();
	if(month.equals("January") || month.equals("February") || month.equals("March")) {
		season="Winter";
	}
}
}
