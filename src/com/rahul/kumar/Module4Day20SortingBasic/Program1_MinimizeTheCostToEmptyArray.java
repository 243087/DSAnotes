package com.rahul.kumar.Module4Day20SortingBasic;

import java.util.Arrays;

// Given int[n] minimize the cost to empty given array where (cost of removing an element = sum of elements left in the array).
public class Program1_MinimizeTheCostToEmptyArray {

	static void costDeduct(int []arr) {
		// first sort the given arr in descending order
		 Arrays.sort(arr);
		System.out.println("Given arr is sorted to ascending order "+Arrays.toString(arr));
		int first =0;
		int last = arr.length-1;
		while(first<last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		System.out.println("Sorted to Descending order "+Arrays.toString(arr));      // for sorting TC = O[NlogN]     SC = O[1]
		
		long totalCost =0;
		for(int i=0;i<arr.length;i++) {                                       // for this algorithm  TC = O[N]   
			long contri =(i+1)*arr[i];
			totalCost += contri;
		}
		System.out.println(totalCost);                            // Total for this program   TC = O[NlogN] + O[N] = O[NlogN]
		                                                         //                           SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,5,1,-3};
		System.out.println("Given array is "+Arrays.toString(arr));
		costDeduct(arr);
	}
}
