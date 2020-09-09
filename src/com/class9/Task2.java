package com.class9;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
//		Write a guessing game where the user has to guess a secret number between 1 and 20.
//		After  every  guess  input,  the  program  tells the  user  whether  their  number  was  too large  or  too  small. 
//		The  program  will  keep asking  the  user  to  enter  the  number  until he  finds  the  correct  number.  
//		When  the correct answer is found the system should display "Congratulations!!. You got it!"
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter number from 1 to 20 to findd the secrect Number"); {
			
			int secretNum=16;
			
			
			for (int i=1; i<=20; i++) {
				
				int guessNum=scan.nextInt();
			if(guessNum<secretNum) {
				
				System.out.println("number is small, so add anothr number Mr.Tester");
			}else if(guessNum>secretNum){
				System.out.println(" number is large add another number Mr.Tester");
			}else if(guessNum ==secretNum) {
				System.out.println("Gongrates");
			}
		}
		}
		}
		}
