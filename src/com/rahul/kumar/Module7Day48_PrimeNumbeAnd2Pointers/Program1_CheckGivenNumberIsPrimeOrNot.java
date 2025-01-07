package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Scanner;

// < Question > : Given a number N. Check if it is prime or not.
public class Program1_CheckGivenNumberIsPrimeOrNot {

	static boolean checkPrime(int num) {
		if(countDiv(num)==2)
			return true;
		return false;
	}
	static int countDiv(int num) {
		int count =0;
		for(int i=1;i*i<=num;i++) {
			if(num%i!=0)
				continue;
			if(i*i==num)
				count++;
			else
				count +=2;
		}
         return count;                                              //              TC = O[N^1/2]
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println(checkPrime(num));
	}
}
