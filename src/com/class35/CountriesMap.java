package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountriesMap {
public static void main(String[] args) {
	Map<String, String> countriesMap=new HashMap<>();
	countriesMap.put("Afghanistan", "Kabul" );
	countriesMap.put("Pakistan", "Islam Abad" );
	countriesMap.put("United States", "Washington" );
	countriesMap.put("Iran", "Tehran" );
	countriesMap.put("Tajikistan", "Dashanbe" );
	countriesMap.put("Uzbekistan", "Tashkent" );
	countriesMap.put("Turkmenistan", "Ashgabat" );
	Collection<String> strName=countriesMap.values();
	for(String str: strName) {
		System.out.println(str);
		
	}
}
}
