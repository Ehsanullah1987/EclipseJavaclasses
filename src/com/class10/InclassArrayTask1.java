package com.class10;

public class InclassArrayTask1 {

public static void main(String[] args) {
	//first way task one
	char[] chars=new char[6];
	chars[0]='A';
	chars[1]='B';
	chars[2]='C';
	chars[3]='D';
	chars[4]='E';
	chars[5]='F';
	System.out.println(chars[3]);
	// Second Way task one
	char[]chars1= {'a', 'b', 'c', 'd', 'e', 'f'};
	System.out.println(chars1[5]);
	// first way Task Two
	String[] names=new String[5];
	names[0]="Ehsanullah";
	names[1]="Farid";
	names[2]="Zabi";
	names[3]="Rahmat";
	names[4]="Qari";
	System.out.println(names[0]);
	// second way task two.
	String[] namesOfHackerGroup= {"Rahmat", "Ehsanulalh","Hamid","DR","Farid"," Zabi", "Fahim"};
	System.out.println(namesOfHackerGroup[0]);
	// task 3 first way
	String[] words= {"Java", "Saturday", "day", "coding"};
	System.out.println("Saturday is java "+words[3]+" day");
	// task 3 Second way
	String[] words1=new String[4];
	words1[0]="Java";
	words1[1]="Saturday";
	words1[2]="Day";
	words1[3]="Coding";
	System.out.println(" Today is Java "+words1[0]+" class");
	System.out.println("-----------------------------------");
	for (int i=0; i<words1.length; i++) {
		System.out.println(words1[i]);
	}
	}
}