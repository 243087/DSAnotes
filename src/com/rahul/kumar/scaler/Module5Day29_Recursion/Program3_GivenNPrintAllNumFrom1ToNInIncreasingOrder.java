package com.rahul.kumar.scaler.Module5Day29_Recursion;

import java.util.Scanner;

public class Program3_GivenNPrintAllNumFrom1ToNInIncreasingOrder {

	static void printNum(int num) {
	     if(num==0) {
	    	 return;
	     }
		 printNum(num-1);
		 System.out.println(num);
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		printNum(num);
		
	}
}
