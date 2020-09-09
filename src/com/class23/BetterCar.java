package com.class23;

public class BetterCar {

	/* we want to build make as Toyota cars
	 * that will have different models and colors 
	 */
		public static String make;
		public String model;
		public String color;
		public int speed;
		public int doors;
		BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
			model=carModel;
			color=carColor;
			speed=carSpeed;
			doors=carDoors;
		}
		
	public static void main(String[] args) {
		make="BMW";
		// compiler will give an error, we have to pass value when we build a 
		// those value will be passed as arguments to the constructor 
		// through costructor instace variables will get initialized
		//BetterCar bcar1=new BetterCar();
		BetterCar bcar1=new BetterCar("X5", " Blue", 400, 2);
		bcar1.getDetails();
	}
	public void getDetails() {
		System.out.println("I build "+make+" "+model);
		System.out.println("My car has "+doors+" doors My car seed up to "+speed);
	}
}
