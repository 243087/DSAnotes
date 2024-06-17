package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program6PrintMultipleOf4Bt1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.print("Multipl of 4 are :");
		int i=4;
		while(i<=num) {
			if(i%4==0)
				System.out.print(i+" ");
			i++;
		}
	}
}
