package com.class11;

public class InclassTask1 {

public static void main(String[] args) {
	//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
	String [] cars= {"Corolla", "Camry", "Ford", "Worgler", "Prius", "Nisson"};
	for(int i=0; i<6; i++){
	System.out.println(cars[i]);
	
	}System.out.println("--------------------------------------------");
	String [] car=new String[3];
	car[0]="Corolla";
	car[1]="Camry";
	car[2]="Nisson";
	for(int j=0; j<3; j++) {
		System.out.println(car[j]);
	}
	//Create an array on integers and calculate the sum of all elements in an array.
	int[] array= {2, 3, 4, 6};
	int sum=0;
	
	for(int i=0; i<array.length; i++) {
		sum+=array[i];
		
	}
	System.out.println(" The sum of all elements is "+sum);
	//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
	
	String [] country= {"Afghanistan", "Pakistan", "Iran", "USA"};
	for (int i=0; i<country.length; i++) {
	if(country.equals("Afghanistan")) {
		System.out.println(" The capital of Afghanistan is Kabul");
	}
		
	}
	String [] countries= {"Afghanistan", "Pakistan", "Iran", "USA"};
	for(String getCountry:countries) {
		if(getCountry.equals("USA")) {
		System.out.println("The capital of USA is Washington D.C");
		}else if(getCountry.equals("Pakistan")) {
			System.out.println("The capital of Pakistan is Islam Abad");
		}else if(getCountry.equals("Iran")) {
			System.out.println("The capital of Iran is Tehran");
		}else if(getCountry.equals("Afghanistan")) {
			System.out.println("The Capital of Afghanistan is Kabul Jan");
		}
	}
}
}


