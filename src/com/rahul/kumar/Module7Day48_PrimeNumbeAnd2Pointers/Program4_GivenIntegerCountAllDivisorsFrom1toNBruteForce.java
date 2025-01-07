package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Arrays;

public class Program4_GivenIntegerCountAllDivisorsFrom1toNBruteForce {

	static int [] countDivisors(int num) {
		int []ans = new int[num];
		for(int i=1;i<=num;i++) {
			 ans[i-1] = divisors(i);
		}
		return ans;                                        //         TC = O[N*N^1/2]
	}
	static int divisors(int num) {
		int count = 0;
		for(int i=1;i*i<=num;i++) {
			if(num%i!=0)
				continue;
			if(i*i==num)
				count++;
			else
				count +=2;
		}
		return count;
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(Arrays.toString(countDivisors(num)));
	}
}
