package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.Arrays;

public class Program2_GivenArrayFind_Kth_LargestElement {

	static int findKth(int []arr,int k) {
		Arrays.sort(arr);                                //             TC = O[NlogN]       SC = depends on which sorting we are using
		return arr[arr.length-k];
	}
	public static void main(String[] args) {
		int []arr = {8,5,1,2,4,9,7};
		int k = 3;
		System.out.println(findKth(arr,k));
	}
}
