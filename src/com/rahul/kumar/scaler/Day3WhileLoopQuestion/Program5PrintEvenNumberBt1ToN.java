package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program5PrintEvenNumberBt1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.print("Even Numbers are :");
		int even = 2;
		while(even<=num) {
			if(even%2 == 0)
				System.out.print(even +" ");
			even++;
		}
	}
}
