package com.class10;

public class ArrayDemo {

public static void main(String[] args) {
	int[]nums=new int[5];
	nums[0]=12;
	nums[1]=13;
	nums[2]=14;
	nums[3]=15;
	// to find numbers of element inside an array we use .length(property of array)
	System.out.println(nums.length);
	System.out.println(nums[2]);
	String[] array= {"Winter", "fall","Summer","Spring"};
	// I was born in Summer
	System.out.println("I was born in "+array[2]);
	int arraySize=array.length;
	System.out.println(arraySize);
	int [] score= {80,90, 70, 100, 99};
	System.out.println(score[4]);
	}

}
