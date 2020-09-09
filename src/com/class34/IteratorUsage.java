package com.class34;

import java.util.*;

public class IteratorUsage {
public static void main(String[] args) {
	List<String> stringList=new ArrayList<>();
	stringList.add("Esra");
	stringList.add("Hasan");
	stringList.add("AK");
	stringList.add("Salim");
	stringList.add("Aka");
	stringList.add("Halim");
	//remove names that are shorter that 4 charater
	stringList.remove(2);
	System.out.println(stringList);
	System.out.println("-----------------------------");
	for(int i=stringList.size()-1; i>=0;i--){
		if(stringList.get(i).length()<=4) {
			stringList.remove(i);
			
		}
	}
	System.out.println(stringList);
}
}
