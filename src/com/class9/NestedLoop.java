package com.class9;

public class NestedLoop {
public static void main(String[] args) {
	for(int i=1; i<=3; i++) {
		System.out.println("I am in the outer loop");
		for(int j=1; j<=4; j++) {
			System.out.println(j);
	}
	
	}
	System.out.println("_____________________________");
	for(int i=0; i<=3; i++) {
		System.out.println("I am in the outer loop");
		for(int j=0; j<=4; j++) {
			System.out.println(i+" "+j);
	}
	
	}
}
}
