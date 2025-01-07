package com.rahul.kumar.Module8_Day59_InterviewProblem;

// < Question > : Given an array A, find a pair of indices (i, j) such that A[i] = A[j] and the absolute difference |i - j| is 
//                minimized. In simpler terms, you need to find two equal elements in the array that are the closest to each other and 
//                return the minimum distance between them.
public class Program3_MinimumDistanceEqualPair_BruteForce {

	static int findMinDistane(int []arr) {
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					int distance = (j-i);
					ans = Math.min(ans,distance);                   //       TC = O[N^2]      SC = O[1]
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int []arr = {7,1,3,4,1,7};
		System.out.println(findMinDistane(arr));
	}
}
