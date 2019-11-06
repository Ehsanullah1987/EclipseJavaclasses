package com.class7;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		/* You need to ask user to pay for coffee
		 * you need to keep asking user to pay for it until
		 * entered price is equal =5;
		 * after user paid then say "enjoy your coffee!"
		 */
		Scanner Scan=new Scanner (System.in);
		int price;
do {
	System.out.println("Please pay for your coffee");
	price=Scan.nextInt();
}while(price!=5);

System.out.println("Enjoy yuor coffee");
// 2 way while
int price1;
System.out.println("please pay for your coffee");
price1=Scan.nextInt();
while(price1!=5) {
	System.out.println("please pay for your cofffee");
	price1=Scan.nextInt();
	
}
System.out.println("Enjoy your coffee");
	   
	}

}
