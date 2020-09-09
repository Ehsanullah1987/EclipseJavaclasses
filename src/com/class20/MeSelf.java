package com.class20;

public class MeSelf {
	public static void main(String[] args) {
		MySonMath son1=new MySonMath();
		son1.name="Ensar";
		son1.add1();
		son1.add2(2,3);
		int MySonTaskResult=son1.add3();
		System.out.println(MySonTaskResult);
		
		int result4=son1.add4(5, 7);
		if(result4==12) {
			System.out.println("Good Job");
		//System.out.println(result4);
	}else {
		System.out.println("You are not Good enough");
	}

	}
	}

