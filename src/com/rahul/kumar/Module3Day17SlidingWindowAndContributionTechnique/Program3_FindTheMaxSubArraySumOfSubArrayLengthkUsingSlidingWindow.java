package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

public class Program3_FindTheMaxSubArraySumOfSubArrayLengthkUsingSlidingWindow {

	static void sumSub(int []arr, int k) {
		int subSum =0;
		for(int i=0;i<k;i++) {
			subSum +=arr[i];
		}
		int maxSum = subSum;
		int l=1;
		int r=k;
		while(r<arr.length) {
			int remove = arr[l-1];
			int add = arr[r];
			subSum = subSum -remove+add;
			maxSum = Math.max(maxSum,subSum);
			l++;
			r++;
		}
		System.out.println(maxSum);                                 //       TC = O[N]           SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,-2,4,-1,2,6};
		int length = 4;
		sumSub(arr,length);
	}
}
