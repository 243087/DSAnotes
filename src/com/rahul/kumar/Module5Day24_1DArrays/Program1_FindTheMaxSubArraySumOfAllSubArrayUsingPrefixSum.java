package com.rahul.kumar.Module5Day24_1DArrays;

import java.util.Arrays;

public class Program1_FindTheMaxSubArraySumOfAllSubArrayUsingPrefixSum {
	
	static void maxSumByPrefixSum(int []arr) {
	   int []preSum = new int[arr.length];
	   preSum[0] = arr[0];
	   for(int i=1;i<arr.length;i++) {
		   preSum[i] = preSum[i-1] +arr[i];
	   }
	   System.out.println("Prefix sum array is : "+Arrays.toString(preSum));
	   
	 
	   int result = -Integer.MAX_VALUE;
	   for(int s=0;s<arr.length;s++) {
		   for(int e=s;e<arr.length;e++) {
			   int subSum =0;
			   if(s==0)
				    subSum = preSum[e];
			   else
				   subSum = preSum[e] - preSum[s-1];
			   
			   result = Math.max(result,subSum);                  //             TC = O[N^2]           SC = O[N]
			    
		   }
	   }
	   System.out.println(result);
	}
	
	public static void main(String[] args) {
		int []arr = {-2,3,4,-1,5};
		maxSumByPrefixSum(arr);
	}
}

