package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;

import java.util.Arrays;

//  Question
// Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B. If the answer 
//does not exist return an array with a single integer "-1". First sub-array means the sub-array for which starting index in minimum.

public class Program1_Assignment2_BruteForce {

	static int [] subSum(int []arr, int sum) {

		 for(int l=0;l<arr.length;l++) {
			 for(int r=l;r<arr.length;r++) {
				 int temp =0;                   // Initialize sum for each new subarray starting point
	             for(int i=l;i<=r;i++) {
	            	 temp += arr[i];
	             }
	             if(temp==sum)
	            	 return new int[] {l+1,r+1};
			 }
		 }
		 return new int[] {-1};                                       //         TC = O[N^3]
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int sum = 5;
		System.out.println(Arrays.toString(subSum(arr,sum)));
	}
}
