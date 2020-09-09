package com.class20;

public class Mexico {
	public static void main(String[] args) {
		// when public
		USA us2=new USA();
		System.out.println("Access from Mexico to places");
		System.out.println(us2.mainState); // work because it is in public
		System.out.println(us2.school);
		System.out.println();
		
	}

}
