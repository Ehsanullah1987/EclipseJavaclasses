package com.class8;

public class BreakAndCountinue {
public static void main(String[] args) {
	for(int i=1; i<10; i++) {
		if(i==5) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("I am outside of the loop");	
	//continue-- it will skip current iteration.
	for(int i=1; i<10; i++) {
		if(i==4|| i==5 ||i==7) {
			continue;
		}
		System.out.println(i);
	}
	System.out.println("I am outside of the loop");
}
}
