package com.class28;

public class Car {
	String make, model;
	 Car(){
		 System.out.println("I am a non argument constructor");
	 }
	 Car(String name, String model){
		 this.make=make;
		 this.model=model;
		 
	 }

}
class Tesla extends Car{
 boolean autopilot;
 Tesla(){
	 super();
	 System.out.println(" I am a child class but non argument constructor");
 }
 Tesla(String make, String model, boolean autopilot){
	  super("make", "Model"); 
	 this.autopilot=autopilot;
 	 
 }
 public void displayInfo() {
	 System.out.println("Car "+make+" has an autopilot "+autopilot);
 }
}