package com.class27;

public class Examples {
public String hello(String str) {
	return str;
}
public String hello(String str, String str2) {
	return str+" "+str2;
	
}

}
class smallExample extends Examples{
	public String hello(String str) {
		return"Hello"+str;

	}
}
