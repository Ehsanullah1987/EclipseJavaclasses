package com.class12;

public class StringMiniputingDemo {
public static void main(String[] args) {
	/* 
	 * This method checks whether a String is empty or not.
	 * This method returns true if the given string
	 * is empty, else it returns false.
	 */
	String str="";
	System.out.println("Is this string empty= "+str.isEmpty());
	String str2="Hello";
	System.out.println("Is this String empty= "+str2.isEmpty());
	System.out.println("------------------------");
	// the Job of "\n" is splice the sentence. like in the bellow example.
	String sentence="Each day has a promise to brithen up the day, \nBut first you must allwo the sun to come your way";
	System.out.println(sentence);
	System.out.println("***********************");
	
	/* This method appends one String to the end of other. 
	 * The method returns a String with the value of the 
	 * String passed in to the method appended to the end
	 * of the String used to invoke this method.
	 */
	String str3="Hello";
	String str4="World";
	String str5="People";
	
	System.out.println(str3+" "+str4+ " "+str5);
	System.out.println(str3+" ".concat(str4+" ").concat(str5));
	
}
}
