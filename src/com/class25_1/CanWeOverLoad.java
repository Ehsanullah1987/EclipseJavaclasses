package com.class25_1;

public class CanWeOverLoad {
// can We over load a privvate method? yes,
	
	private void methodOne() {
		System.out.println("i am methon one");
	}
	private void methodOne(String str) {
		System.out.println("I am methd one with "+str);
	}
	// can we overload a main method?
	//public static void main(String []args) {
		//System.out.println("I amd main method");
	//}
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	public static void mian(String srt, String[]args) {
		System.out.println("I am a main method wiht 2 parameters");
	}
	public static void main(String[] args) {
		System.out.println("I am a mian method with String arry");
		CanWeOverLoad.main("String");
		String[] array= {"A", "B"};
		main("Hello",array);
	}

}