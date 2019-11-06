package com.class11;

public class D2ArrayTask {

 public static void main(String[] args) {
	int [][] nums=new int[2][3];
	nums[0][0]=10;
	nums[0][1]=5;
	nums[0][2]=6;
	
	nums[1][0]=3;
	nums[1][1]=4;
	nums[1][2]=7;
	System.out.println(nums[1][2]);
	
	 int [][] numbers= {
			 {8,7,5,3,8},
			 {1,5,6,4,9},
			 {3,6,8,0,7}
	 };
	 System.out.println("The value in index 1 and 4 is=" +numbers[1][4]);
	// To identify the numbers of Rows 
			 System.out.println("The numbers of Rows are:= "+numbers.length);
			 // To identify the numbers of Columns/Elements in a row
			 System.out.println("The numbers of Columns are:= "+numbers[1].length);
	
}}
 
 