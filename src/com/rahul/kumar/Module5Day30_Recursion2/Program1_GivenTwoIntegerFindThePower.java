package com.rahul.kumar.Module5Day30_Recursion2;

import java.util.Scanner;

public class Program1_GivenTwoIntegerFindThePower {

	static int findPower(int num,int pow) {
		if(pow==0)
			return 1;
		return findPower(num, pow-1)*num;                      //         TC = O[N]        SC = O[N]
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		System.out.println(findPower(num,power));
	}
}
