package com.class12;

public class Task1InClass {
public static void main(String[] args) {
	// create two Strings and initializing them with some value.
	//implement the following methods on those Strings.
	/*
	 * sen.length();
	 * sen.equals();
	 * sen.contains();
	 * sen.toUpperCase();
	 * sen.toLowerCase();
	 * sen.equalsIgnoreCase(anotherString);
	 */
	String name1="Abdulwajid";
	
	String name2="Ehsanullah";
	System.out.println(name1.length()+" "+name2.length());
	
	boolean isEquals=name1.contentEquals(name2);
	System.out.println(isEquals);
	
	System.out.println(name2.contains("s"));
	String name3= "ABEda";
	 name3=name3.toLowerCase();
	 System.out.println(name3);
	 name3=name3.toUpperCase();
	 System.out.println(name3);
	 String name4="Bibi Zahida";
	 String name5="bibi zahiDA";
	 System.out.println(name4.equalsIgnoreCase(name5));
}
}
