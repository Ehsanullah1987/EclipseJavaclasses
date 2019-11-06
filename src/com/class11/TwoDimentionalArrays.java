package com.class11;

public class TwoDimentionalArrays {
	public static void main(String[] args) {
// Declare 2D Array.
	int[][] array =new int [3][4];
	// first row
	array [0][0]=44;
	array [0][1]=80;
	array [0][2]=33;
	array [0][3]=20;
	// Second row
	array [1][0]=10;
	array [1][1]=5;
	array [1][2]=7;
	array [1][3]=8;
	// Third row
	array [2][0]=10;
	array [2][1]=9;
	array [2][2]=70;
	array [2][3]=6;
	//int sum=0;
	for(int i=0; i<array.length;i++) {
		for(int j=0; j<array[i].length;j++) {
			//sum=sum+array[i][j];
			System.out.println(array[i][j]);
	}
		//System.out.println("the sum of all elements are ="+sum);
	}
	}
}
