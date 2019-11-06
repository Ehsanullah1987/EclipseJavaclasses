package com.class13;

public class Taks2InClass {
public static void main(String[] args) {
	//create string and print it in reverse order (Sunday--> yadnus).
	String day="Sunday";
	//System.out.println(day.charAt(5)+""+day.charAt(4)+""+day.charAt(3));
	for( int i=day.length()-1; i>=0; i--) {
		System.out.println(day.charAt(i));
	}
	System.out.println("-------------------------------");
	//Create a string and if the string is not empty perfom the foloowing: if the
	//stirng has an odd nnumber of charachers and has 3 or more characters, print the character in the String.
	
	String str1="Hello";
	int middle=str1.length()/2;
	if(!str1.isEmpty()) {
		if(str1.length()%2!=0 && str1.length()>=3) {
			System.out.println(str1.charAt(middle));
		}
	}
	System.out.println("------------------------");
	int a=5;
	System.out.println(a/2);
}
}
