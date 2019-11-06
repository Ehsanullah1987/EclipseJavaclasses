package com.class4;

import java.util.Scanner;

public class InClassTask2 {
public static void main(String[]args){
	Scanner loan=new Scanner(System.in);
	System.out.println("Tell me the amount of loan");
	double loaner=loan.nextDouble();
	if(loaner<2000000) {
		System.out.println("lend the money");
	}else {
		System.out.println("Reject the money");
	}
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter temperature");
	int temp=scan.nextInt();
	System.out.println("Please enter your city"); 
	String cityName=scan.nextLine();
	int convertedTemp=(temp-32)*5/9;
	System.out.println("The temprerature in city "+cityName+"is"+convertedTemp);
}
}
 