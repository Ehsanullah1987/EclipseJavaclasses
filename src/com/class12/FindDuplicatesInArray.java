package com.class12;

public class FindDuplicatesInArray {
	public static void main(String[] args) {
		int[] nums= {3,5,4,7,5,3};
		for (int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[j]);
				}
			}
		}
	}

}
