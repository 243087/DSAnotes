package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

public class Program1_FindTheSumOfAllPossibleSubArray {

	static void sumSubArr(int [] arr) {
		int totalSum =0;
		for(int s=0;s<arr.length;s++){
			 for(int e=s;e<arr.length;e++) {
				 int arrSum =0;
				 for(int i=s;i<=e;i++) {
					 arrSum += arr[i];
				 }
				 totalSum += arrSum;                         // TC = O[N^3]          SC = O[1]
			 }
	     }
		System.out.println("Total sum of subArray is : "+totalSum);
	}

	public static void main(String[] args) {
		int []arr = {3,2,5};
		sumSubArr(arr);
	}
}
