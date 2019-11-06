package com.class14;

import java.util.Scanner;

public class ToCharArrayMethod {
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    String str="hello";
    char[] array=str.toCharArray();
    for(int i=0; i<array.length; i++){
      System.out.println(array[i]);
    }
  
}
}