package com.class10;

public class ArraysInclassTask2 {

public static void main(String[] args) {
	String[] countries= {"Afghanistan", "Pakistan", "Iran", "Russia", "Turkey", "America"};
	for (int i=0; i<countries.length; i++) {
		if(countries[i].equals("America")) {
			System.out.println("the capital name is Washington D.C");
		}else if(countries[i].equals("Afghanistan")) {
			System.out.println("the capital name is Kabul");
		}else if(countries[i].equals("Pakistan")) {
			System.out.println("The capital name is Islam Abad");
		}else if(countries[i].equals("Iran")) {
			System.out.println("The capital name is Tehran");
		}else if(countries[i].equals("Rusia")) {
			System.out.println("The capital name is Moscow");
		}else if(countries[i].equals("Turkey")) {
			System.out.println("The Capital name is Ankara");
		}else {
			System.out.println("I do not know");
		}
	}
	
	}
	}


