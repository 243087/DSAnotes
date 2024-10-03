package com.rahul.kumar.scaler.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

public class Program3_GivenArrayNeedToSortUsingMergeSort {

	static void mergeSort(int []arr, int low, int high) {
		if(low == high)
			 return;
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	static void merge(int []arr,int low,int mid,int high) {
		int arrRange = high - low + 1;
		int [] mergeArr = new int [arrRange];
		
		int a = low;
		int b = mid+1;
		int c = 0;
		while(a<=mid && b<=high) {
			if(arr[a]<arr[b]) {
				mergeArr[c] = arr[a];
				c++;
				a++;
			}
			else {
				mergeArr[c] = arr[b];
				c++;
				b++;
			}
		}
		while(a<=mid) {
			mergeArr[c] = arr[a];
			c++;                                                 //              TC = O[NlogN]            SC = O[N]
			a++;
		}
		while(b<=high) {
			mergeArr[c] = arr[b];
			c++;
			b++;
		}
// till above point our mergeArr is sorted but we need our original array itself to be sorted, so will copy from mergeArr to original array arr.

		int m = low;
		for(int i=0;i<mergeArr.length;i++) {
			arr[m] = mergeArr[i];
			m++;
		}
	}
	public static void main(String[] args) {
		int []arr = {3,10,6,8,15,2,22,18,17};
		int low = 0;
		int high = arr.length-1;
		mergeSort(arr,low,high);
		System.out.println(Arrays.toString(arr));
	}
}
