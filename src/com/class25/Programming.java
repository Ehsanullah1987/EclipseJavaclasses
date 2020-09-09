package com.class25;

public class Programming {
 
	public void programming() {
		System.out.println("I love Programming Languages");
	}
	public void programming(String str) {
		System.out.println("I love Java");
	}
	
	public static void main(String[] args) {
		Programming obj=new Programming();
		obj.programming();
		obj.programming("Java");
		
	}
}
