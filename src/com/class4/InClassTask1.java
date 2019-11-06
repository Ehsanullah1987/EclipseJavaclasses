package com.class4;

public class InClassTask1 {
	public static void main(String[] args) {
		boolean diploma = true;
		double score = 3.5;
		if (diploma) {
			System.out.println("Congratulation");
			if (score >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("you should have studied harder");
			}
		} else {
			System.out.println("To get a degree");
		}
		/*Create a java progame and store values
		 * of mortgage rate and mortgage price.
		 * program should check if rate is higher than 4.5 user will not buy a house if price 4.5 buyer will consider if price is more
		 * 200000 buyer will take loan.otherwise buyer will pay cash.
		 */
		double mortgageRate; // Teacher way she declare Rate and Price as double for example, double rate=4.5; and double price=20000;
		double mortgagePrice;
		mortgageRate = 4.5;
		mortgagePrice = 200000;
		if (mortgageRate > 4.5) {
			System.out.println("Will not buy a house");

		} else {

			System.out.println("will consider Buying");

			if (mortgagePrice > 200000) {
				System.out.println("The user will take a loan");

			} else {
				System.out.println("The user will pay cash");
			}

		}

	}

}
