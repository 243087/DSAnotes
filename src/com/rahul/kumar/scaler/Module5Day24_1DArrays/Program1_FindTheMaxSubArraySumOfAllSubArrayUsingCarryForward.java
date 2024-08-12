package com.rahul.kumar.scaler.Module5Day24_1DArrays;

public class Program1_FindTheMaxSubArraySumOfAllSubArrayUsingCarryForward {

	static void maxSumByCarryForward(int []arr) {
		int result = -Integer.MAX_VALUE;
		for(int s=0;s<arr.length;s++){
			 int arrSum =0;
			 for(int e=s;e<arr.length;e++) { 
				 arrSum +=arr[e];
				 result = Math.max(result,arrSum);                   // TC = O[N^2]          SC = O[1]
			 }
	     }
		System.out.println("Total sum of subArray is : "+result);
	}
	public static void main(String[] args) {
		int []arr = {-2,3,4,-1,5};
		maxSumByCarryForward(arr);
	}
}
