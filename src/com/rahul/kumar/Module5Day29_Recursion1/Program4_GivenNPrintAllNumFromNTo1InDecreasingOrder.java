package com.rahul.kumar.Module5Day29_Recursion1;

import java.util.Scanner;

// <Question> : Whirlpool wants to design a time for their washing customer. This feature is a simple countdown timer. When the 
//              user set the time, for eg. 10 mins,  the washing machine needs to show each minute passing, counting down until it
//              reaches 0
public class Program4_GivenNPrintAllNumFromNTo1InDecreasingOrder {

	static void printNum(int num) {
		
		if(num ==0) {
			return;
		}
		System.out.println(num);
		printNum(num-1);
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		printNum(num);
		
	}
}
