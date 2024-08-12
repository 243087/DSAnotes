package com.rahul.kumar.scaler.Module4Day20SortingBasic;

import java.util.Arrays;

public class Program6_SortTheArrayUsingInsertionSort {

	static void sortArray(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int j= i-1;
			int x= arr[i];
			
			while(j>=0) {
				if(arr[j]>x) 
					arr[j+1] = arr[j];
				else 
					break;
				j--;
			}
			arr[j+1] = x;                                      //          TC = O[N^2]         SC = O[1]
		}
		System.out.println("After sorting"+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int []arr = {3,1,9,4,6,2};
		System.out.println("Before sorting"+Arrays.toString(arr));
		sortArray(arr);
	}
}
