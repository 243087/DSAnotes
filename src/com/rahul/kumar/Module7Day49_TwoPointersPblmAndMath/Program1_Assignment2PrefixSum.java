package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;

import java.util.Arrays;


//Question
//Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B. If the answer 
//does not exist return an array with a single integer "-1". First sub-array means the sub-array for which starting index in minimum.
public class Program1_Assignment2PrefixSum {

	static int [] subSum(int []arr, int sum) {
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixSum[i] = prefixSum[i-1] +arr[i];
		}
		
		for(int l=0;l<arr.length;l++) {
			for(int r=l;r<arr.length;r++) {
				int temp;
				if (l == 0) {
                    temp = prefixSum[r]; 
                } else {
                    temp = prefixSum[r] - prefixSum[l - 1]; 
                }
				
				if(temp==sum)
					return new int[] {l+1,r+1};                        //     TC = O[N^2]
			}
		}
		return new int[] {-1};
	}
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 5;
        System.out.println(Arrays.toString(subSum(arr, sum)));
    }
}
