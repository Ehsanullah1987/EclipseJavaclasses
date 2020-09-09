package com.class7;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		/* lest's ask user to enter if it is raining or not (true or false)
		 * as long as there is rain let's keep asking.
		 * as soon as there is no rain----> you can go to the park
		 */
		Scanner Scan=new Scanner(System.in);
		boolean isRain;
		
		//=new Scanner(System.in);
		do {
			System.out.println("is it rainging?");
			isRain=Scan.nextBoolean();
		}while(!isRain);
		System.out.println("Go to park");
		
	}

}
