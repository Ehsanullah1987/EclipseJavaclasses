package com.class27;

public class StudentTest {
public static void main(String[] args) {
	// teacher work
	SyntaxStudent ss=new SyntaxStudent();
	ss.study();
	//ss.doHomework();ce: not visible since method inside child is private
	ss.attendClasses();
	ss.research();

	Student student=new SyntaxStudent();
	student.study();
	student.research();
	student.attendClasses();
	//student.doHomework();ce: not visible since method inside parent is private

	
	
	// My work
//	SyntaxStudent student1=new SyntaxStudent();
//	student1.study();
//	//student1.doHomework();
//	student1.attendClasses();
//	//student1.reseach();
//	Student stu=new SyntaxStudent();
//	stu.study();
//	stu.research();
//	stu.attendClasses();
}

}
