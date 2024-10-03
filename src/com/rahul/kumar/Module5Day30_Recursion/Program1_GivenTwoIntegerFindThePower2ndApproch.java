package com.rahul.kumar.Module5Day30_Recursion;

import java.util.Scanner;

public class Program1_GivenTwoIntegerFindThePower2ndApproch {

	static int findPower(int num,int pow) {
		if(pow == 0)
			return 1;
		if(pow%2==0) {
			return findPower(num,pow/2) * findPower(num,pow/2);
		}
		return findPower(num,pow/2) * findPower(num,pow/2) * num;
	}
	public static void main(String[] args) {                           //               TC = O[N]      SC = O[logN]
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		System.out.println(findPower(num,power));
	}
}
