package com.rahul.kumar.scaler.Day6FunctionQuestion;

import java.util.Scanner;

public class Program7PrintPrimeNumberBt1ToN {

	static boolean isPrime(int a) {
		int count = 0;
		for(int j=1;j<=a;j++) {
			if(a%j==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
