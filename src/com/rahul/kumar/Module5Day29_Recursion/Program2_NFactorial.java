package com.rahul.kumar.Module5Day29_Recursion;

import java.util.Scanner;

public class Program2_NFactorial {

	static int fact(int num) {
		if(num==0)
			return 1;
		
		return fact(num-1)*num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num  = sc.nextInt();
		System.out.println(fact(num));
	}
}
