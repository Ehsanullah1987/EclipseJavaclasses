package com.class12;

public class StrigStartWithPrefix {
	public static void main(String[] args) {
		/*
		 * This method tests if a String starts with the
		 * specified prefix beginning
		 */
		String str2= "It is very hot in the class";
		System.out.println("Is this string starts with= "+str2.startsWith("It"));
		System.out.println("Is this string starts with="+str2.startsWith("is"));
		
		/* This method tests if this string ends with
		 * the specified suffix.
		 */
		System.out.println("Is this string end with="+ str2.endsWith("class"));
	}
	

}
