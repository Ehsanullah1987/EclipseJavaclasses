package com.class12;

public class StringMinipulating {
	public static void main(String[] args) {
		// there are two ways to create string objects.
		// first calls String Literal
		String name = "John123";
		System.out.println(name);
		// second way calls string with "new" keyword.
		String name1 = new String("John");

		/*
		 * this method returns the length of this strinh. the length is equal to the
		 * number of 16-bit unicode characters in the string.
		 */
		int name1Len = name1.length(); // Or you can get the result by Syso("the length name1 is ="+name1.length());
		System.out.println("The length of name1Len is= " + name1Len);

		System.out.println("----------------------------------");
		String str1 = "Hello World";
		System.out.println("Before::" + str1);
		str1 = str1.toLowerCase();
		System.out.println("After::" + str1);
		// .equals()
		String str2 = "HElLo WoRld";
		boolean isEquals = str1.contentEquals(str2);
		System.out.println(isEquals);
		// .equalsIgnoreCase();
		// This method does not care for capitalization and compare the content only.
		System.out.println(str1.equalsIgnoreCase(str2));
		String str3 = "Mohammad";
		System.out.println("Before:: " + str3);
		str3 = str3.toUpperCase();
		System.out.println("After::: " + str3);
	}
}
