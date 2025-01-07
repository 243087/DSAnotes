package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

public class Program1_MostOptimisedSolution {

	static int findFibo(int num) {
		int a = 0;
		int b = 1;
		for(int i=2;i<=num;i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		return b;                                                //          TC = O[N]            SC = O[1]
	}
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num = sc.nextInt();
		  System.out.println(findFibo(num));
		}
}
