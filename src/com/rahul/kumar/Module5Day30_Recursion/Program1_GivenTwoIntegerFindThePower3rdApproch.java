package com.rahul.kumar.Module5Day30_Recursion;

import java.util.Scanner;

public class Program1_GivenTwoIntegerFindThePower3rdApproch {

	static int findPower(int num, int pow) {
		if(pow==0)
			return 1;
		int p = findPower(num,pow/2);
		if(pow%2==0)
			return p*p;                                               //             TC = O[logN]        SC = O[logN]
		return p*p*num;
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
