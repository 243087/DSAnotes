package com.rahul.kumar.Module5Day29_Recursion;

import java.util.Scanner;

public class Program5_GivenNPrintNTo1And1ToN {

	static void printNum(int num) {
		
		if(num==0) {
			return;
		}
		System.out.println(num);
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
