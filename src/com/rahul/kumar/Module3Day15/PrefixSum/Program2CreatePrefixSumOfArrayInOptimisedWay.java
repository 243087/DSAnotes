package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program2CreatePrefixSumOfArrayInOptimisedWay {

	static int [] optimisedPrefixSum(int []arr) {
		int [] newArr = new int[arr.length];
		newArr[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			newArr[i] = newArr[i-1]+arr[i];
		}
		return newArr;                                        // time complexity : O[N]   || Space complexity : O[N]
	}
	public static void main(String[] args) {
		int [] arr = {2,5,6,0,11,20};
		 System.out.println("Given array is "+Arrays.toString(arr));
		System.out.println("Prefix sum of given array is "+Arrays.toString(optimisedPrefixSum(arr)));
	}
}
