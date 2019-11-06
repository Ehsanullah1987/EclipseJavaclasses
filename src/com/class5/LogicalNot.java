package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		boolean b1 = !true;
		boolean b2 = !false;
		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = true;
		if (!traffic) { // using ! we are reverting condition
			System.out.println("Hellow");
		} else {
			System.out.println("Bye");
		}
		boolean isRain = false;
		if (!isRain) {
			System.out.println("Take umberlla");
		} else {
			System.out.println("Do not take an Umberlla");
		}
		// let's compare 2 numbers using not operator
		int num1 = 10;
		int num2 = 11;
		if (!(num1 == num2)) {
			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
		// if not are not marry or anna then you are not my daughters
		String name="Zahida";
		String name1="Abeda";
		// true OR false---> true add not --->false
		if(!(name.contentEquals("zahida") || name.contentEquals("Abeda"))) {
			System.out.println("You are not my Sister");
		}else {
			System.out.println("You are my sister");
		}
		}
	}

