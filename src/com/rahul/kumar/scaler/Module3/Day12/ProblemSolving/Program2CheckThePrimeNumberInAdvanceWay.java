package com.rahul.kumar.scaler.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class Program2CheckThePrimeNumberInAdvanceWay {

	static int factorCheck(int num) {
		int count =0;
		for(int a=1;a*a<=num;a++) {
			if(num%a == 0) {
				int b = num/a;
				if(a==b) {
					count +=1;
				}
				else {
					count +=2;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int  num = sc.nextInt();
		int countFactor = factorCheck(num);
		if(countFactor == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime");
	}
}
