package com.class21;

public class Employee {
	int eID;
	int salary;
	static String CEO;

	void printInfo() {
		System.out.println("Employee Id " + eID + " , salary is:" + salary + " CEO is Sumair");
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.printInfo();
	    emp1.eID=5;
		emp1.salary=8000;
		Employee emp2=new Employee();
		emp2.eID=8;
		emp2.salary=85000;
		//emp2.CEO="Sumiar";
		emp2.printInfo();
		
		
	}

}
