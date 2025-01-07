package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

public class Program1_FindNth_FibonacciNumber_ByRecursion {

	static int findFibo(int num) {
		if(num==0 || num==1)
			 return num;
		return findFibo(num-1) + findFibo(num-2);                          //        TC = O[2^n]        SC = O[N]
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num = sc.nextInt();
	  System.out.println(findFibo(num));
	}
}
