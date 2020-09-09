package com.class25;

public class Employee {
	
	public static String companyName;
	int salary;
	protected int employeeId;
	private String employeeSSN;
	void work() {
		System.out.println("I work in "+companyName+"comapy");
	}
	void getPaid() {
		System.out.println("I get paid "+salary);
	}

}
