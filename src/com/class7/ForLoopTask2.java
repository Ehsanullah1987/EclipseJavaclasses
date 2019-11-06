package com.class7;

public class ForLoopTask2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.print(" "+sum+" ");
		}
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\");
		int sumAll=0;
		for (int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
			System.out.print(" " +sumAll+" ");
		}
		System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		int total=2;
		for (int x=1; x<=3; x++) {
			total=total*x;// 2=2*1; 4=2*3; 12=4*3.
			System.out.print(" "+total+" ");
		}
		
	}

}
 