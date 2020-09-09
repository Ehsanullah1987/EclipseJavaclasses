package com.class7;

public class Task1Loop {
	public static void main(String[] args) {
		int i=50;
		while(i<+100) {
			if(i%2==1) {
			System.out.println(i);
		}
		i++;
	}
		System.out.println("--------------------");
		int i2=50;
		while(i2<100) {
			if(i2%2==0) {
				System.out.println(i2);
			
			}
			i2+=2;
		}
		System.out.println(i2);
}
}
