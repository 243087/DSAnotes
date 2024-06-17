package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program11ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int revNum =0;
		while(num>0) {
			int rev = num%10;
			revNum = revNum*10 + rev;
			num = num/10;
		}
		System.out.println("Reversed Number is "+revNum);
	}
}
