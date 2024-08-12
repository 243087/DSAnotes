package com.rahul.kumar.scaler.Module5Day24_1DArrays;

public class Program1_FindTheMaxSubArraySumOfAllSubArray {

	static void maxSum(int []arr) {
		int ans = -Integer.MAX_VALUE;
		
		for(int l=0;l<arr.length;l++) {
			for(int r=l;r<arr.length;r++) {
				int sum =0;
				for(int i=l;i<=r;i++) {
					sum += arr[i];
				}
				ans = Math.max(ans, sum);                         //             TC = O[N^3]         SC = O[1]
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int []arr = {-2,3,4,-1,5};
		maxSum(arr);
	}
}
