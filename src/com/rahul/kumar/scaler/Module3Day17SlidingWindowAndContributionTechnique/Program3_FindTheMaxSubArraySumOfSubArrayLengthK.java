package com.rahul.kumar.scaler.Module3Day17SlidingWindowAndContributionTechnique;

public class Program3_FindTheMaxSubArraySumOfSubArrayLengthK {

	static void sumSub(int []arr,int length) {
		int l=0;
		int r=length-1;
		int max = -Integer.MAX_VALUE;
		while(r<arr.length) {
			int subSum = 0;
			for(int i=l;i<=r;i++) {
				subSum +=arr[i];
			}
			l++;
			r++;
			max = Math.max(max, subSum);
		}
		System.out.println("Max length is "+max);           // TC = O[N^2]          SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,-2,4,-1,2,6};
		int length = 4;
		sumSub(arr,length);
	}
}
