package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;

// Given a sorted arr[ N ]. Find the first occurrence of K(Search Element should has to be present in the array).
public class Program2_GivenASortedArrayFindTheFirstOccuranceOfKByBinarySearch {

	static int firstOccurance(int []arr,int num) {
		int l = 0;
		int r = arr.length-1;
		int ans = -1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(num == arr[mid]) {
				ans = mid;
				r = mid -1;
			}
			else if(num > arr[mid])
				l = mid+1;
			else
				r = mid-1;
		}
		return ans;                                                 //        TC = O[logN]          SC = O[1]
	}
	public static void main(String[] args) {
		int []arr =  {-5,-5};
		int num = -5;
		System.out.println(firstOccurance(arr,num));
	}
}
