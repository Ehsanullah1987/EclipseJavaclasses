package com.class15;

public class StringMoreExample {
public static void main(String[] args) {
	String str="Syntax Technologies";
	char letter=str.charAt(5);
	System.out.println(letter);
	//length=19
	//System.out.println(str.charAt(str.length()));// string indexOutOfBounder
	System.out.println(str.charAt(str.length()-1));
	//get a substring from a string
	//Syntax
	String substr1=str.substring(0, 6);
	System.out.println(substr1);
	// Technologies Inc
	String substr2=str.substring(7);
	System.out.println(substr2);
}
}
