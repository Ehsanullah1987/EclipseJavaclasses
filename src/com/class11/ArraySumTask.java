package com.class11;

public class ArraySumTask {
	public static void main(String[] args) {
	int [][] numbers= {
			{2, 4, 5, 6},
			{4, 5, 6, 7},
			{6, 1, 3, 0}
	};
	int sum=0;
	for(int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers[i].length; j++) {
			System.out.print(numbers[i][j] +" ");
			sum=sum+numbers[i][j];
		}
		System.out.println();
	}
	System.out.println("the sum of all elements in the array is = " +sum);
			int sum1=0;
			for(int nums[]:numbers) {
				for(int getNum:nums) {
					sum1=sum1+getNum;
				}
				System.out.println();
			}
			System.out.println("the sums is= "+sum1);
			
		}
		

}
