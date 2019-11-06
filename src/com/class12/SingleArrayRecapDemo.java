package com.class12;

public class SingleArrayRecapDemo {
	public static void main(String[] args) {
		int[][] array1 = { { 9, 10, 11 }, // first Row.
				{ 5, 6, 8 } // second Row.
		};
		for (int i[] : array1) {

			for (int j : i) {
				System.out.println(j);
			}
		}
		System.out.println("----------------------");
		int[][] array2 = { { 44, 55, 67 }, { 11, 22, 33 } };

		for (int[] is : array2) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}

}
