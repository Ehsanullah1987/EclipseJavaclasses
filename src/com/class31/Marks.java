package com.class31;
//We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
//by student A and in four subjects (each out of 100) by student B. 
//Create class ‘Marks’ with an abstract method ‘getPercentage’.
//It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
//as its parameters for student B.
//Test your code
public abstract class Marks {
double math;
double history;
double physic;
double science;

abstract void getPercentage();
}
class A extends Marks{
	A(double math, double history, double physic){
		this.math=math;
		this.history=history;
		this.physic=physic;
}

	@Override
	void getPercentage() {
		System.out.println((math+history+physic)/3);
	}
	}
	class B extends Marks{
		B(double math, double history, double physic, double science){
			this.math=math;
			this.history=history;
			this.physic=physic;
			this.science=science;
			
		}

		@Override
		void getPercentage() {
			System.out.println((math+history+physic+science)/4);
			
		}
		
	}
	
