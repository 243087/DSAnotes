package com.rahul.kumar.Module6Day37_Searching_BinarySearch;


//Given a sorted arr[ ]. Search an element K. If K is present return it's index otherwise return -1.
public class Program1_GivenSortedArraySearchElementKInArrayByBinarySearch {

	static int findElement(int []arr, int num) {
		int l =0;
		int r =arr.length-1;

		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid] == num)
				return mid;
			if(num>arr[mid])
				l = mid+1;
			else
				r = mid-1;
		}
		return -1;                                              //                TC = O[logN]      SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,6,9,12,14,19,20,23,25,27};
		int num = 23;
		System.out.println(findElement(arr,num));
	}
}


//Solution  By BinarySearch approach
//Step 1:    Identity search space (l,r)
//Step 2:    If  mid is answer store it or return
//Step 3:    Discard left or right half