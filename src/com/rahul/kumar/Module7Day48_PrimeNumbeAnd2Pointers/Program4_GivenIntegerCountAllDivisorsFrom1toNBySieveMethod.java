package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Arrays;

public class Program4_GivenIntegerCountAllDivisorsFrom1toNBySieveMethod {

	static int [] countFactore(int num) {
		int [] factor = new int[num+1];
		
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j +=i) {
				factor[j] +=1;
			}
		}
		return factor;                                        //               TC = O[NlogN]
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(Arrays.toString(countFactore(num)));
	}
}

// if we don't want to return the divisors of 0 the write the below code
//                   |
//                   |
//                   |
                   
//   return Arrays.copyOfRange(factor, 1, num + 1);