package com.class6;

import java.util.Scanner;

public class ClassTask {
public static void main(String[] args) {
	/* ask user to enter the month they were morn
	 * based ont the month define the season
	 * if user is born in Jan, feb,dec ---winter
	 * if mar, apr, may---spring
	 * if jun, jul, aug---summer
	 * if sep, oct,nov ---fall
	 * otherwise --.unknown
	 * at the end of the progarm "you were born in ______"
	 */
	Scanner Scan=new Scanner(System.in);
	System.out.println("Please enter the month");
	int dob=Scan.nextInt();	
	String seasonOfBirth;
	if(dob>=1 && dob<=3) {
		seasonOfBirth="Winter";
		System.out.println("Winter");
	}else if(dob>=4 && dob<=6) {
	System.out.println("Summer");
	}else if(dob>=7 && dob<=9) {
		System.out.println("Summer");
	}else if(dob>=10 && dob<=12) {
		System.out.println("Spring");
	}else {
		System.out.println("Unknown");
	}
	System.out.println("you are bornin "+dob);
	
} 
} 
