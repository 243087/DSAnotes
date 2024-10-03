package com.rahul.kumar.scaler.Module5Day33_Hashing1;

import java.util.HashMap;

public class Program4_CountSubArraySumEqualToZeroOptimised {

	static int subSum(int []arr) {
		int keySum =0;
		int countSubSum =0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			keySum += arr[i];
			
			if(keySum==0)
				countSubSum++;
			
			if(hm.containsKey(keySum)==false) {
				hm.put(keySum,1);
			}
			else {
				countSubSum++;
			}

		}
		return countSubSum;                                       //             TC = O[N]          SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {2,2,1,-3,4,3,1,-2,-3,2};
		System.out.println(subSum(arr));
	}
}
