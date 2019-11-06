package com.class6;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	int quiz, midterm, finalScore, average;
	System.out.println("Please enter quiz score");
	quiz=scan.nextInt();
	System.out.println("Please enter the midterm Score");
	midterm=scan.nextInt();
	System.out.println("Please enter the final Score");
	finalScore=scan.nextInt();
	average=(quiz+midterm+finalScore)/3;
	if(quiz>=90 && quiz==100) {
		System.out.println("A");
	}
			}
}
