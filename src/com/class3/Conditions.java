package com.class3;

public class Conditions {
	public static void main(String[]args) {
		int expectedHours=15;
		int actualHours=20;
		// if expected hours are more than actual -> you will succeed
		//otherwise, please study more
		if(actualHours>expectedHours) {
			System.out.println("you will succeed!!!");
		}else {
			System.out.println("please study more!!!");
			
			double teaPrice=4.99;
			double allowedPrice=3.99;
			teaPrice-=2; // 2.99= 4.99-2
			//if price is more that i can afford i will not buy
			//if price is less or matches what i can afford them i will buy tea
			
			if (allowedPrice<=teaPrice) {
				System.out.println("I will buy tea");
				System.out.println("And i will enjoy my tea");
			}else {
				System.out.println("I cannot afford, i need to study more");
				System.out.println("I will go back to study more");
			}
			System.out.println("I keep writing some code");
			System.out.println("I keep writing more code");

			
		}
	}

}
