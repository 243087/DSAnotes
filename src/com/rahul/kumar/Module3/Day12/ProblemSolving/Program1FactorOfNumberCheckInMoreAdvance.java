package com.rahul.kumar.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class Program1FactorOfNumberCheckInMoreAdvance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = sc.nextInt();
		int count =0;
		for(int a =1;a*a<=num;a++) {
			if(num%a == 0) {
				int b =num/a;
				if(a == b)
					 count +=1;
				else
					count +=2;
			}
		}
		System.out.println("factor of "+num+" is: "+count);
	}
}
