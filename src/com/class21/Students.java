package com.class21;

public class Students {
public String studentName;
public int stundentId;
public static int numberOfStudents;

public static void main(String[] args) {
	Students s1=new Students();
	s1.studentName="AbdulWajid and Zahida";
	s1.stundentId=000123;
	Students.numberOfStudents++;
	
	Students s2=new Students();
	s2.studentName="AbdulWajid and Zahida";
	s2.stundentId=000123;
	Students.numberOfStudents++;
	
	System.out.println("The total number of students is: "+s1.numberOfStudents);
	System.out.println("The total number of students is: "+s2.numberOfStudents);
}
}
