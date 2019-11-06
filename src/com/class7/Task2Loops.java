package com.class7;

public class Task2Loops {
	public static void main(String[] args) {
		boolean workDay = true;
		int num = 4;
		while (workDay) {
			if (num == 6) {
				workDay = false;// break;
			System.out.println("I do need a day off");
			
		}else {
			System.out.println("I do not need a day off");
		}
		num++;
	}

}
}
