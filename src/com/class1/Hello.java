package com.class1;



public class Hello {

 public static void main(String[] args) {

		// Single line Comment

		/*
		 * multiple line comments This is my first program
		 */

		System.out.println("Hello world!!");
		System.out.println("Hello Friends!!!!");
	

	}
 
}
class Employee{
private String name;   
public String getName() {    
	return name;    
	}    
public void setName(String name){    
	this.name=name;    
}
}
class Test {       
public static void main(String[] args) {               
	Employee e=new Employee();        
	e.setName("Harry");           
	System.out.println(e.getName());  
	System.out.println("jjjj");
	} 



}
