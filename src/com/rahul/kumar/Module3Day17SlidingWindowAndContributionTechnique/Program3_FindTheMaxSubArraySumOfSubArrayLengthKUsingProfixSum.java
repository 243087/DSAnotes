package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

import java.util.Arrays;

public class Program3_FindTheMaxSubArraySumOfSubArrayLengthKUsingProfixSum {

	static void sumSub(int []arr,int length) {
		int []preArr = new int[arr.length];
		preArr[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			preArr[i] = preArr[i-1]+arr[i];
		}
		System.out.println("Prefix sum array is "+Arrays.toString(preArr));
		
		int l=0;
		int r=length-1;
		int max = -Integer.MAX_VALUE;
		while(r<arr.length) {
			int subSum=0;
			if(l==0)
				subSum = preArr[r];
			else
				subSum = preArr[r]-preArr[l-1];
			
			l++;
			r++;
			max = Math.max(max, subSum);                            // TC = O[N]         SC = O[N]
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int []arr = {3,-2,4,-1,2,6};
		int length = 4;
		sumSub(arr,length);
	}
}
