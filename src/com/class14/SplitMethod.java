package com.class14;

public class SplitMethod {
public static void main(String[] args) {
	/* .split()
	 * This method splits this string around matches of the given regular expression.
	 */
	String str="Video provides a powerful way to help you prove your point.";
	String[] array=str.split(" ");
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	// how can we find how many sentences are in the following string;
	String str1= "Today is Sunday. Its sunny day. and we are haveing java class";
	String [] array2=str1.split("\\.");
	System.out.println("The numbers of sentences in the given String is::" +array2.length);
	for(String string:array2) {
		System.out.println(string.trim());
	}
}
}
