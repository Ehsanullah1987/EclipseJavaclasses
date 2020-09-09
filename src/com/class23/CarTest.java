package com.class23;

public class CarTest {
public static void main(String[] args) {
	Car.make="Toyota";
	Car car1=new Car();  // Car = ClassName. car1= object reference variable. = assigning operator. new Keyword used to create an Object.
	car1.model="Camry";  // Car()= Constructor. ; end  of statement
	car1.color="Silver";
	 car1.speed=200;
	 car1.doors=4;    // constructor is a special method/ block of code that is being executed when we create an object/ an instance
	car1.getDetails();   // of the class.
	
	Car car2=new Car();
	car2.model="Corolla";
	car2.color="black";
	car2.speed=150;
	car2.doors=2;
	car2.getDetails();
	Car car3=new Car();
	car3.model="Prius";
	car3.color="white";
	BetterCar betterCar1=new BetterCar("Toyota", "White", 180, 4);
	betterCar1.getDetails();
}
}
