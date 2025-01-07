package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program2CreatePrefixSumOfArrayInOptimisedWayMost {

	static int [] optimisedPrefixSum(int []arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[i-1]+arr[i];
		}
		return arr;                                        // time complexity : O[N]   || Space complexity : O[1]
	}
	public static void main(String[] args) {
		int [] arr = {2,5,6,0,11,20};
		 System.out.println("Given array is "+Arrays.toString(arr));
		System.out.println("Prefix sum of given array is "+Arrays.toString(optimisedPrefixSum(arr)));
	}
}
