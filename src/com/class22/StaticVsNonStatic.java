package com.class22;

public class StaticVsNonStatic {
//template for a students (School, name, grade)
	static String school="Syntax";
	String name;
	char grade;
	// instace method
	void getInfo() {
		System.out.println("My name is "+name+" and i am going to " +school+" and my grade is "+grade);
	}
	//static method
	static void getInfo1() {
		System.out.println("I am attendinng classes at "+school);
		//System.out.println("My name is "+name); we will get compiler error because we cannot access static memebers within Static
		//method.
		
		/* accessing static members within same class
		 * just use name for a variable
		 * or call method by its name only
		 */
		System.out.println(school);
		//getInfo1();
	}
}
