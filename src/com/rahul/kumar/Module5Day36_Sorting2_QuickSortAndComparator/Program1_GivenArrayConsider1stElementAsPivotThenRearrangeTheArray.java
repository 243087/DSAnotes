package com.rahul.kumar.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.Arrays;

// Given an integer array, consider first elements as pivot, rearrange the elements such that for all i :
//Note 1:  If A[i] < p then it should be present on left side.
//Note 2:  If A[i] > p then it should be present on right side.

public class Program1_GivenArrayConsider1stElementAsPivotThenRearrangeTheArray {

	public static void main(String[] args) {
		int []arr = {54,26,93,17,77,31,44,55,20};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));                   //      TC = O[NlogN]        
	}
}
