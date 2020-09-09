package com.class18;

public class Task {
void largerNumber(int num1, int num2) {
	if(num1>num2) {
		System.out.println("num1 is larger then num2 ");
	}else { 
		System.out.println("num1 is smaller then num2");
	}
	}
 public static void main(String[]args) {
	 Task task1=new Task();
	 
	 task1.largerNumber(7, 6);
 }
}

