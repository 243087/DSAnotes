package com.rahul.kumar.scaler.Module3Day17SlidingWindowAndContributionTechnique;

import java.util.Arrays;

public class Program1_FindTheSumOfAllPossibleSubArrayInOptimisedWayUsingPrefixSum {

	static void sumSubArr(int []arr) {
		int [] preSum = new int[arr.length];
		preSum[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			preSum[i] = preSum[i-1] + arr[i];
		}
		System.out.println("Prefix sum array is : "+Arrays.toString(preSum));
		
		int totalSum =0;
		for(int s=0;s<arr.length;s++){
			 for(int e=s;e<arr.length;e++) {
				 int arrSum =0;
				if(s==0)
					arrSum +=preSum[e];
				else
					arrSum +=preSum[e] - preSum[s-1];
				 totalSum += arrSum;                              // TC = O[N^2]      SC = O[N]
			 }
	     }
		System.out.println("Total sum of subArray is : "+totalSum);
	}
	public static void main(String[] args) {
		int []arr = {3,2,5};
		sumSubArr(arr);
	}
}
