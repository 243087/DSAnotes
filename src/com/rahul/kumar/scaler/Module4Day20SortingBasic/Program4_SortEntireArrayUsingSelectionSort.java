package com.rahul.kumar.scaler.Module4Day20SortingBasic;

import java.util.Arrays;

public class Program4_SortEntireArrayUsingSelectionSort {

	static int [] selectionSort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
		return arr;
	}
	static void swap(int []arr, int i,int minIndex) {
		int temp = arr[i];
		arr[i]   = arr[minIndex];
		arr[minIndex] = temp;                           //                        TC = O[N^2]      SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {5,1,4,9,2};
		System.out.println("Before sorting"+Arrays.toString(arr));
		System.out.println("After sorting"+Arrays.toString(selectionSort(arr)));
		//selectionSort(arr);
	}
}
