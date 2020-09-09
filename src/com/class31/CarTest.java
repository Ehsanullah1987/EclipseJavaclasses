package com.class31;

	public class CarTest{
		public static void main(String[] args) {
			System.out.println("---------Car---------");
			CarTest car=new CarTest();
			System.out.println(car.calculateSalePrice());
			
			System.out.println("---------Sedan---------");
			Sedan sedan=new Sedan(2000, "pink", 30);
			System.out.println(sedan.calculateSalePrice());
			
			System.out.println("---------Truck---------");
			Truck truck = new Truck(2000, "grey", 3000);
			double price=truck.calculateSalePrice();
			System.out.println(price);
		}

		private char[] calculateSalePrice() {
			// TODO Auto-generated method stub
			return null;
		}
	}
