package com.class10;

public class AnimalsTypes {
public static void main(String[] args) {
	String[] animals= {"Dog", "Cat", "Cow"};
	int size=animals.length;
	for(int i=0; i<size; i++) {
		System.out.println(animals[i]+" ");
	}
	double[] numbers= {3, 4, 6, 5, 7};
	for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	// i want to print all values from an array
	// when vaule is Dog---> I love dogs.
	String[] animals1= {"Dog", "Cat","monkey","Wolf"," fox", "lion"};
	for (int i=0; i<animals1.length; i++) {
		System.out.println(animals1[i]);
		if (animals1[i].equals("Dog")) {
			System.out.println("I love dogs");
		}else {
			System.out.println(animals1[i]);
		}
		}
	}
	
}
