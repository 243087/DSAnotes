package com.rahul.kumar.Module5Day34_Hashing2;

// Given an array[ N ]. Check if there is a subarray with sum = k

public class Program3_CheckIfSubArraySumEqualToK {

	static boolean subSum(int []arr,int num) {
		for(int l=0;l<arr.length;l++) {
			for(int s=l;s<arr.length;s++) {
				int subSum =0;
				for(int i=l;i<=s;i++) {
					subSum +=arr[i];
				}
				if(subSum == num) {
					return true;
				}
			}                                                 //          TC = O[N^3]          SC = O[1]
		}
		return false;
	}
	public static void main(String[] args) {
		 int []arr = {2,3,9,-4,1,5,6,2,5};
		 int num = 10;
		 System.out.println(subSum(arr,num));
	}
}
