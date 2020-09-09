package com.class19;

public class InClassTask1 {
	void createEmail (String name, String lastName, String email) {
		name="John";
		lastName="Snow";
		email="@gmail";
		String emialAddress=name+lastName+email;
	}
	public static void main(String[] args) {
		InClassTask1 obj=new InClassTask1();
		String x=obj.createEmail();
		System.out.println(x);
	}

}