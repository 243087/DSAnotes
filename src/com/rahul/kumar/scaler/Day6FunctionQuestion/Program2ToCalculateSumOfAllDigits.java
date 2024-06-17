package com.rahul.kumar.scaler.Day6FunctionQuestion;

import java.util.Scanner;

public class Program2ToCalculateSumOfAllDigits {

	static int sumDigit(int a) {
		int sum = 0;
		while(a>0) {
			int temp = a%10;
			sum +=temp;
			a = a/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println("Sum of "+num+" is "+sumDigit(num));
	}
}
