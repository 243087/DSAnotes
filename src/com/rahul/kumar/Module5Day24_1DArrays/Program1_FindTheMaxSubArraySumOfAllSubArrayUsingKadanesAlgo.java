package com.rahul.kumar.Module5Day24_1DArrays;

public class Program1_FindTheMaxSubArraySumOfAllSubArrayUsingKadanesAlgo {

	static void maxSumByKadanesAlgo(int []arr) {
		int ans = -Integer.MAX_VALUE;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			if(sum>ans)
				ans = sum;
			if(sum<0)
				sum =0;
		}
		System.out.println(ans);                         //              TC = O[N]            SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {-2,3,4,-1,5};
		maxSumByKadanesAlgo(arr);
	}
}
