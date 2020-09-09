package com.class25;

public class Test {
	public static void main(String[] args) {
		System.out.println("Creating an object of the Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax ";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of the ScrumTeam");
		
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product BackLog, Sprint Backlog, Burn Down Chart ";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		System.out.println("Creating an object of Developer Class");
		
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.employeeSSN=13301; does not have access because it is located in another class because of private modifier.
	}

}
