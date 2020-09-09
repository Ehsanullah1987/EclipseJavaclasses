package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String>arrayList=new ArrayList<String>();
	//to store value inside you colletcion
	
	arrayList.add("john");
	arrayList.add("Jane");
	arrayList.add("Jack");
	//to retrieve the value from arrayList
	System.out.println(arrayList.get(1));
	//add more values
	arrayList.add("james");
	arrayList.add("John");
	arrayList.add("Jane");
	//how many elements inside the arrayList?
	int size=arrayList.size();
	System.out.println(size);
	ArrayList<Integer>numArrList=new ArrayList<>();
	numArrList.add(100);
	numArrList.add(200);
	numArrList.add(300);
	//retrieving values
	System.out.println(numArrList.get(2));
	// int num=control or counter---> controls # of iterations for the loop
	for (int num=0; num<numArrList.size();num++) {
	System.out.println(numArrList.get(num));
	}
	for(Integer number:numArrList) {
		System.out.println(number);
	}
}
}
