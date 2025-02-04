package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;

//Given an array of N elements. Check if there exists a subarray with sum equal to 0.
public class Program4_CheckIfSubArraySumEqualZeroOptimisedWay {

	static boolean subSum(int []arr) {
		int keySum = 0;
		HashMap<Integer,Integer> prefixHashMap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			keySum += arr[i];
			if(prefixHashMap.containsKey(keySum)==false)
				prefixHashMap.put(keySum,1);
			else
				return true;
			if(keySum == 0)
				return true;
		}
		return false;                                             //               TC = O[N]            SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {2,2,1,-3,4,3,1,-2,-3,2};
		System.out.println(subSum(arr));
	}
}
