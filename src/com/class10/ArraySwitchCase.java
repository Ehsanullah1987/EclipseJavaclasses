package com.class10;

public class ArraySwitchCase {
public static void main(String[] args) {
	String[] countries= {"Afghanistan", "Pakistan", "Iran", "Russia", "Turkey", "America"};
	for(int i=0; i<countries.length; i++);
String capitalName;
	switch (countries[5]) {
	case "Afghanistan":
		capitalName=("Kabul");
		break;
	case "Pakistan":
		System.out.println("Islam Abad");
		break;
	case "Iran":
		System.out.println("Tehran");
		break;
	case "Russia":
		System.out.println("Moscow");
		break;
	case "Turkey":
		System.out.println("Ankara");
		break;
	case "America":
		System.out.println("Washington D C");
	}
	}

}
