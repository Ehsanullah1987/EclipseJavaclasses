package com.class11;

public class ArrayInclassTask {
	public static void main(String[] args) {
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		String [][] names= {
				{"Amand", "Mohammad", "jafar", "Yaqub"},
				{"John", "Zee", "Thomes", "lincoln"},
				{"Wajid", "Zahida", "Abeda", "Palwasha"}
		};
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				System.out.print(names[i][j] +" ");
			}
			System.out.println();
	}

}
}