package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program9PrintSumOfDigitOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int sum = 0;
		while(num>0) {
			int rev = num%10;
			sum +=rev;
			num = num/10;
		}
		System.out.println("Sum of "+num+" is : "+sum);
	}
}
