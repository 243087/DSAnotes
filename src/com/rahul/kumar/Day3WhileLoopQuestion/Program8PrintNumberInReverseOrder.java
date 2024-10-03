package com.rahul.kumar.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program8PrintNumberInReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num>0) {
			int rev = num%10;
			System.out.print(rev);
			num = num/10;
		}
	}
}
