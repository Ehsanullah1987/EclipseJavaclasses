package com.class13;

public class RegularExpressions {
public static void main(String[] args) {
	String str="1234545Hel555lo3434";
	// Print only text and not numbers.
	System.out.println(str.replaceAll("[0-9]", ""));
	// print only numbers.
	System.out.println(str.replaceAll("[a-zA-Z]", ""));
	String str2="Hi#$%How#$%#$4356346";
	// "^" this symbol means that we remove everything except text and numbers.
	System.out.println((str2.replaceAll("[^a-zA-Z0-9]", "")));
	//we can use this one do the same thing as line 12 System.out.println(str2.replaceAll("\\W", ""));
	String str1="12-22-1990";
	System.out.println(str1.replace('-','/'));
	System.out.println(str1.replaceAll("-","/"));
}
}
