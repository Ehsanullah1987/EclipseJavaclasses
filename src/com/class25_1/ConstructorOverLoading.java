package com.class25_1;

public class ConstructorOverLoading {
// Different amount of parameters
	ConstructorOverLoading(){
			System.out.println("I am non-argument constructor");
	}
	ConstructorOverLoading(String str){
		System.out.println("I am constructro with 1 String para");
	}
	// Having different type of parameters
	ConstructorOverLoading(int num){
		System.out.println("I am constructor with 1 number parameter");
	}
}
