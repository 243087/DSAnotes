package com.rahul.kumar.Module6Day42_Stack2;

// <Question> : Find sum of ( max-min ) for all subarrays.
public class Program10_FindSumOf_MaxMinusMin_OfAllSubArray {

	static int sum(int []arr) {
		int ans = 0;
		for(int l=0;l<arr.length;l++) {
			for(int r=l;r<arr.length;r++) {
				int minVal = Integer.MAX_VALUE;
				int maxVal = Integer.MIN_VALUE;
				for(int i=l;i<=r;i++) {
					minVal = Math.min(minVal,arr[i]);
					maxVal = Math.max(maxVal,arr[i]);
				}
				ans += maxVal-minVal;
			}
		}
		return ans;                                              //           TC = O[N^3]      SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {2,7,4};
		System.out.println(sum(arr));
	}
}
