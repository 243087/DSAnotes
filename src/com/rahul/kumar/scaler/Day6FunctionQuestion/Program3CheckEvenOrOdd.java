package com.rahul.kumar.scaler.Day6FunctionQuestion;

import java.util.Scanner;

public class Program3CheckEvenOrOdd {

	static boolean checkEvenOdd(int a) {
		return a%2 ==0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		boolean check = checkEvenOdd(num);
		if(check==true)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
