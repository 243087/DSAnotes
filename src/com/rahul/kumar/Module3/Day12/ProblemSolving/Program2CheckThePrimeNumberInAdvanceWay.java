package com.rahul.kumar.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class Program2CheckThePrimeNumberInAdvanceWay {

	static String primeCheck(int num) {
		int factor =0;
		for(int a=1;a*a<=num;a++) {
			if(num%a == 0) {
				int b = num/a;
				if(a==b) 
					factor +=1;
				else
					factor +=2;
			}
		}
		if(factor==2)                                               //         TC = O[N^1/2]
			 return "Prime No";
		else
			 return "Not Prime";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int  num = sc.nextInt();
		System.out.println(primeCheck(num));

	}
}
