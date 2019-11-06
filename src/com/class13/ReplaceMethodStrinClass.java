package com.class13;

public class ReplaceMethodStrinClass {
public static void main(String[] args) {
	/*.replace()
	 * this method returns a new string resulting 
	 * from replacing all occurrence of oldChar
	 * in this string with newChar.
	 */
	String str="Hello Dear Dan, how are you Dan, How you been?";
	System.out.println((str.replace('n', 'z')));
	System.out.println("======================================= ");
	System.out.println(str.replace("Dear", "Respected"));
	System.out.println(" ============================= ");
	System.out.println(str.replace("Dan", "Ben"));
	// changing just first Dan.
	System.out.println(str.replaceFirst("Dan", "Ali"));
	
}
}
