package com.class22;

public class AccessModifiers {
public static void hello() {
	System.out.println("hello"); // acceptable in all entire project
}
protected static void hello1() {
	System.out.println("hello1"); //acceptable in the other package
}
static void hello2() {
	System.out.println("hello2"); // acceptable in the other package
}
private static void hello3() {
	System.out.println("hello3"); // acceptable in the only class
}
}
