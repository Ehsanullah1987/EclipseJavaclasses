package com.class26;

public class RunTimePolymorphism {
public static void main(String[] args) {
	// creating an object on parent class
	Animal animal=new Animal();
	animal.sleep();
	animal.eat();
	
	// creating an object of child class
	Cat cat=new Cat();
	cat.sleep(); //from child. 
	cat.eat(); // from child.
	//Widening
	double d=90;
	//Narrowing
	int i=(int)1.99;
	
	
	//Non primitive Typecasting
	// widening --> creating an object of the class and giving reference to the parent class
	Animal obj=new Cat();
	
	// narrowing
	//Cat obj2=new Animal(); ---> Cannot convert from animal to Cat.
	obj.eat(); // coming from parent
	obj.sleep(); // this method will come from child class ---> runtime polymorphism 
	// obj.meow (); compiler error ---> method won't available
}
}
