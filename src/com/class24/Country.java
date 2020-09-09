package com.class24;

public class Country {
	String capital, name;
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
		
	}
	
	Country(String countryName, String countryCapital){
		name=countryName;
		capital=countryCapital;
		
	}
	
	public static void main(String []args) {
//		Country country1=new Country();
//		country1.name="USA";
//		country1.capital="Wahshington";
//		
//		Country country2=new Country();
//		country2.name="Afghanista";
//		country2.capital="Kabul";
		Country country1=new Country("USA","Washington DC");
		Country country2=new Country("Afghanistan","Kabul");
		Country country3=new Country();
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
	}

}
