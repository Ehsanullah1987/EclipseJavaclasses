package com.class8;

public class Task1 {
	public static void main(String[] args) {
		/* write a code to find the sum of even and odd numbers 
		 * from range 1 to 20
		 * expecting 2 outputs
		 * sum for odd nums=....
		 * sum for even nums=....
		 */
		int sumEven=0;
		for(int i=0; i<=20; i+=2) {
			sumEven= sumEven+i;
			System.out.print(" "+sumEven+" ");
		}
		System.out.println("========================");
		int sumOdd=0;
		for(int i=1; i<=20; i++) {
			sumOdd=sumOdd+1;
			if(i%2!=0) {
				System.out.print(" "+sumOdd+" ");
			}
		}
	}

}
