package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;


// Given a sorted arr[  ]. Search an element K. If K is present return it's index otherwise return -1
public class Program1_GivenSortedArraySearchElementKInArray {
    // By Linear Search
	static int findElement(int []arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num)
				return i;
		}
		return -1;                                       //               TC = O[N]           SC= O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,6,9,12,14,19,20,23,25,27};
		int num = 23;
		System.out.println(findElement(arr,num));
	}
}

