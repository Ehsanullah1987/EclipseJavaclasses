package com.class37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodReturnObject {

	public static void main(String[] args) {
		
		List<String> list=returnStringList("Java", "My favorite subject");
		System.out.println(list);
		Scanner scan=returnScanner();
	System.out.println("Enter your text");
		String nam2e=scan.nextLine();
		System.out.println("Enter your text");
		String name3=scan.nextLine();
	System.out.println("Enter your Number");
int num=scan.nextInt();
		System.out.println("Enter your character");
		char  ch=scan.next().charAt(0);
		System.out.println("Enter boolean");
		boolean bo=scan.nextBoolean();
		
	}
	
	//create a method that will return an Object of Scanner Class
	public static Scanner returnScanner() {
		Scanner scan=new Scanner(System.in);
		return scan;
	}
	//create a method that will return an Object of List Class
	public static List<String> returnStringList(String str, String str1) {
		
		List<String> list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		
		return list;
	}
}