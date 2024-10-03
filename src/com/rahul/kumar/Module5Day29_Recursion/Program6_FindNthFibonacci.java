package com.rahul.kumar.Module5Day29_Recursion;

import java.util.Scanner;

public class Program6_FindNthFibonacci {

	static int nthFibo(int num) {
		if(num<=1)
			return num;
		return (nthFibo(num-1) + nthFibo(num-2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(nthFibo(num));
	}
}
