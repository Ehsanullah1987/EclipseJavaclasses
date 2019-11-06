package com.class14;

public class InclassTask1 {
	public static void main(String[] args) {
	//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
String str="How is the weather out there?";
String str2=str.replaceAll(" ","");
System.out.println(str2);

System.out.println("____________________________________________");

//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.

 String str3="AbcDhy1289#*&%^%@)";
 String str4=str3.replaceAll("[^a-zA-Z]", "");
 System.out.println(str4);
 System.out.println(str4.length());
 System.out.println("===============================================");
 
 //You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
 
 String a="Is it saturday? Is it raining? Do we have a Java Class today?";
 String[] array=a.split("\\?");
 for(int i=0; i<array.length;i++) {
 //System.out.println(array.l);
	 System.out.println();
 }
 
 System.out.println(array.length);
	}

}
