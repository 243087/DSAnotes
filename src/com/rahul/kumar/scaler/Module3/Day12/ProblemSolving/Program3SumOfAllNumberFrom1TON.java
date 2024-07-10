package com.rahul.kumar.scaler.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class Program3SumOfAllNumberFrom1TON {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		long sum = (num*(num+1))/2;
		System.out.println("Sum "+sum);
	}
}
