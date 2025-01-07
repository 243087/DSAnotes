package com.rahul.kumar.Module4Day20SortingBasic;

import java.util.Arrays;

public class Program2_CountTheNobleIntegerForDistinctElementOnly_Optimised {

	static void countNoble(int []arr) {
		// first sort the array in ascending order
		Arrays.sort(arr);
		System.out.println("Sorted array in ascending array is "+Arrays.toString(arr));
		int countNoble =0;
		for(int i=0;i<arr.length;i++) {
			if(i==arr[i])
				countNoble++;
		}
		System.out.println(countNoble);                          //  TC = O[NlogN] + O[N]  = O[NlogN]         SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {1,-5,3,5,-10,4};
		System.out.println("Given array is "+Arrays.toString(arr));
		countNoble(arr);
	}
}
