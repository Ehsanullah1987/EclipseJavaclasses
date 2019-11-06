package com.class7;

public class ForLoop {
	public static void main(String[] args) {
		// say good morning 5 times.
		for(int i=0; i<=4; i++) {
			System.out.println("Good morning");
		}
		System.out.println("********************************************");
		for(int i=1; i<=1; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------");
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("_____________________________________________");
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
	}

}
