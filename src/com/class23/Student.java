package com.class23;

public class Student {
String name;
int grade1, grade2, grade3;
Student(String StudentName, int gr1, int gr2, int gr3){
	name=StudentName;
	grade1=gr1;
	grade2=gr2;
	grade3=gr3;
}
public static void main(String[] args) {
	Student student1=new Student("Massod", 90, 78,100);
	student1.calculateAverage();
	Student student2=new Student("Rahmat", 90, 88,100);
	student2.calculateAverage();
	Student student3=new Student("Zabih", 90, 85,100);
	student3.calculateAverage();
	Student student4=new Student("Qari Sahib", 90, 78,100);
	student4.calculateAverage();
	Student student5=new Student("John", 87, 93,100);
	student5.calculateAverage();

}
public void calculateAverage() {
	int average=(grade1+grade2+grade3)/3;
	System.out.println("Student "+name+" has an average grade of");
}
}
