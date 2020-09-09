package com.class22;

public class InstanceVariables {
String name="Samir"; // instance variable
public static void main(String[] args) {
	String name="Burcu"; // local variable
	System.out.println(name);
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.name);
	obj.name="John";  // changing value of the instance variable
	System.out.println(obj.name);
	// value will be Samir
	InstanceVariables obj1=new InstanceVariables();
	System.out.println(obj1.name);
}
}
