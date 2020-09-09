package com.class23;

public class ConstructorDemo {
ConstructorDemo(){
	System.out.println("I am your constructor");
}
ConstructorDemo(String str){
	System.out.println("I am constructor with 1 String parameter "+str);
}
ConstructorDemo(int num){
	System.out.println("I am Instructor with 2 int parameter "+num);
}
	
public static void main(String[] args) {
	
	
	ConstructorDemo obj=new ConstructorDemo();
	System.out.println("Code after creating an Object");
	obj.hello();
	 ConstructorDemo obj2=new ConstructorDemo("My Parameter");
}
public void hello() {
	System.out.println("Hello Class");
	System.out.println("Hello Instructors");
}
}
