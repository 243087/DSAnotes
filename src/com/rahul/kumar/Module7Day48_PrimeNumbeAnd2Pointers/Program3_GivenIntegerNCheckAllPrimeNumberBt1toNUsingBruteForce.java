package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Arrays;
import java.util.Scanner;

//< Question > : Given an integer N. Check every number from 1 to N if it is a prime number or not.
public class Program3_GivenIntegerNCheckAllPrimeNumberBt1toNUsingBruteForce {

	static boolean [] checkPrime(int num) {
		boolean []ans = new boolean[num];

		
		for(int i=1;i<=num;i++) {
			ans[i-1] = check(i);
		}
		return ans;
	}
	static boolean check(int num) {
		int count = 0;
		for(int i=1;i*i<=num;i++) {
			if(num%i!=0)
				continue;
			if(i*i==num)
				count++;
			else
				count +=2;
		}                                                           //              TC = O[N*N^1/2]
		if(count==2)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(checkPrime(num)));
	}
}
// 1 2 3 4 5 6 7 8 9 10