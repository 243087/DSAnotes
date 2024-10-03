package com.rahul.kumar.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program7PrintPerfectSquareBtN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.print("Perfect square bt "+num+" are :");
		int i=1;
		while(i*i<=num) {
			System.out.print(i*i+" ");
			i++;
		}
	}
}
