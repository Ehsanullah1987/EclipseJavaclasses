package com.class28;

public class CarTest {
public static void main(String[] args) {
	Tesla tesla=new Tesla();
	Tesla tesla1=new Tesla("Tesla","S4",true);
	tesla1.displayInfo();
	Tesla tesla2=new Tesla("Tesla XL", "S5", false);
	tesla1.displayInfo();
}
public void helloNem(String name) {
	System.out.println("Hello "+name);
}
}
