package com.rahul.kumar.Module5Day33_Hashing1;


//Given an array of N elements. Check if there exists a subarray with sum equal to 0.
public class Program4_CheckIfSubArraySumEqualZero {

	static boolean subSum(int []arr) {
		for(int l=0;l<arr.length;l++) {
			for(int s=l;s<arr.length;s++) {
				int subSum =0;
				for(int i=l;i<=s;i++) {
					subSum +=arr[i];
				}
				if(subSum == 0) {
					return true;
				}
			}                                                 //          TC = O[N^3]          SC = O[1]
		}
		return false;
	}
	public static void main(String[] args) {
		 int []arr = {2,2,1,-3,4,3,1,-2,-3,2};
		 System.out.println(subSum(arr));
	}
}
