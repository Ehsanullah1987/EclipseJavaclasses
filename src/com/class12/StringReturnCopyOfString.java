package com.class12;

public class StringReturnCopyOfString {
	public static void main(String[] args) {
		/*
		 * This method returns a copy of the String,
		 * with leading and trailing whitespace omithed.
		 */
		String str6="How are you? ";
		System.out.println(str6);
		System.out.println(str6.trim());
		System.out.println("-----------------------------------");
		/* This method returns the character located at the String's specified index.
		 * The string indexes Start from zero.
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(12));
		/* 
		 * This method returns the index within this string of the 
		 * first occurrence of the specified character or -1
		 * if the character does not occur.
		 */
		String str8="We might mnot be done early";
System.out.println(str8.indexOf('m'));
System.out.println(str8.indexOf('z',12));
	}
}
