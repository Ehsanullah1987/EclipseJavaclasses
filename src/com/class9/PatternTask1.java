package com.class9;

public class PatternTask1 {
public static void main(String[] args) {
	for(int i=1; i<6; i++) {
		for(int j=1; j<=9; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("_________________________________");
	for(int i=5; i>=1; i--) {
		for(int j=5; j>=1; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("=======================================");
	for(int i=5; i>0; i--) {
		for(int j=5; j>0; j--) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
