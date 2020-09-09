package com.class24;

public class Test {
public static void main(String[] args) {
	Child1 child1=new Child1();
	System.out.println(child1.race);
	System.out.println(child1.haircolor);
	System.out.println(child1.eyeColor);
	child1.sing();
	child1.code();
	
	Parent parent=new Parent();
	System.out.println(parent.haircolor);
	System.out.println(parent.eyeColor);
	parent.sing();
	//parent.code(); compiler will give an error
	
	Child2 child2=new Child2();
	System.out.println(child2.race);
	System.out.println(child2.haircolor);
	System.out.println(child2.eyeColor);
	child2.sing();
	child2.dance();
	//child2.code();// cannot be access because child1 one has no inheritance with child2 
	
}
}
