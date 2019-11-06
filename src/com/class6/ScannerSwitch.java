package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	/*Ask user where they are from 
	 * based on the country we will specify favorite food
	 */
	String country, foodName;
	Scanner scan;
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch (country) {
	case "Turkey":
		foodName="kebab";
		break;
	case "Ethiopia":
		foodName="Tibs";
		break;
	case "Morocco":
		foodName="Tajin";
		break;
	case "Kazakhastan":
		foodName="Kumis";
		break;
	case "Pakistan":
		foodName="Beryani";
		break;
	case "Afghanistan":
		foodName="Palaw";
		break;
	case "Rusia":
		foodName="Cavuar";
	case "Cuba":
		foodName="Sofrito";
		break;	
		default:
			foodName="Unknown";
	}
	System.out.println(foodName);
}
}
