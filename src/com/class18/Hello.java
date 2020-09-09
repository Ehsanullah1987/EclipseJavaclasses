package com.class18;

public class Hello {
	
void sayHello(String name) {
	System.out.println("Hello "+name);
}
public static void main(String[] args) {
	Hello obj=new Hello();
	
	obj.sayHello("Asel");
	obj.sayHello("Waqas");
	obj.sayHello("Deigo");
	obj.sayHelloDifferentLanguage("USA");
	obj.sayHelloDifferentLanguage("Russia");
	obj.sayHelloDifferentLanguage("Turkey");
	obj.sayHelloDifferentLanguage("paraGuay");
	//obj.sayHelloDifferentLanguage(123); can not write int value for String.
	obj.sayNameAndAge("Jack", 45);
	obj.sayNameAndAge("olga", 50);
	obj.isSnowing(false);
}
/*create a method that will say hello in different language based
 * on the value that will be passed  user calls a method.
 * 
 */
void sayHelloDifferentLanguage(String country) {
	

	switch(country.toLowerCase()) {
	case "usa":
		System.out.println("Hello");
		break;
	case "russia":
		System.out.println("Privet");
		break;
	case "paraguay":
		System.out.println("Hola");
		break;
	case "albania":
		System.out.println("Pershendetje");
		break;
		default:
			System.out.println("I do not know how to say hello in your language");
	}
}
//method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and i am "+age+" year old");
	}
	// create a method that will check if it snowing
	// if snow ---> stay at home, otherwise go for a walk.
	void isSnowing(boolean isSnowing) { // method header
		//method body
		if(isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
	}
}

