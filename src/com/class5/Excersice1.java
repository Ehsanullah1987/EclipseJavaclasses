package com.class5;

public class Excersice1 {
	public static void main(String[] args) {
	
	int day=5;
	if(day==1 || day==2) {
		System.out.println("Monday");
	}else if(day==2 || day==3){
		System.out.println("Tuesday");
		}else if(day==3 || day==4) {
			System.out.println("Wednesday");
		}else if (day==4 || day==5) {
			System.out.println("Thusday");
		}else if(day==5 || day==6) {
			System.out.println("Friday");
		}else if(day==6 || day==7) {
			System.out.println("Saturday");
		}else if(day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid day");
		}
		
	}

}
