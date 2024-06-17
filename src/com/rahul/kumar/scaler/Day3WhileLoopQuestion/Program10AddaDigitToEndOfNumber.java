package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program10AddaDigitToEndOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println("Enter the Digit to add");
		byte digit = sc.nextByte();
		
		System.out.println("Resulted Number ");
		num = num*10+digit;
		System.out.print(num);
		
	}
}
