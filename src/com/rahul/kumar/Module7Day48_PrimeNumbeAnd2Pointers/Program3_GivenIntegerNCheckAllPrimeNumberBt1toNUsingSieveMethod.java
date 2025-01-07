package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Arrays;

// Given an integer N. Check every number from 1 to N if it is a prime number or not.
// Name as:  Sieve of Eratosthenes
public class Program3_GivenIntegerNCheckAllPrimeNumberBt1toNUsingSieveMethod {

	static boolean [] checkPrime(int num) {
		boolean []ans = new boolean[num+1];
	    Arrays.fill(ans,true);
		ans[0] = false;
		ans[1] = false;
		for(int i=2;i*i<=num;i++) {
			if(ans[i]) {
				// all multiple of that element is prime so make it false
				for(int j=i*i;j<=num;j +=i) {
					ans[j] = false;
				}
			}
		}
		return ans;                                           //               TC = O[Nlog(log(N))]
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(Arrays.toString(checkPrime(num)));
	}
}
// 0 1 2 3 4 5 6 7 8 9 10