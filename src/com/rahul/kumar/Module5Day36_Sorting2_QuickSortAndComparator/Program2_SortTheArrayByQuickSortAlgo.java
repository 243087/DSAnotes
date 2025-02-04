package com.rahul.kumar.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.Arrays;

public class Program2_SortTheArrayByQuickSortAlgo {

	static int []sortArray(int []arr){
		solve(arr,0,arr.length-1);
		return arr;
	}
	static void solve(int []arr,int lo,int hi) {
		if(lo<hi) {
			int pi = quickSelect(arr,lo,hi);
			System.out.println("print"+pi);
			solve(arr,lo,pi-1);
			solve(arr,pi+1,hi);
		}                                                        //      TC = O[NlogN]        SC = O[LogN] 
	}
	static int quickSelect(int []arr, int lo, int hi) {
		int pivotElement = arr[lo];
		int l = lo+1;
		int r = hi;
		while(l<=r) {
			if(arr[l]<pivotElement)
				l++;
			else if(arr[r]>pivotElement)
				r--;
			else {
				swap(arr,l,r);
				l++;
				r--;
			}
		}
		swap(arr,lo,r);
		return r;
	}
	static void swap(int []arr,int l,int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	public static void main(String[] args) {
		int []arr = {54,26,93,17,77,31,44,55,20};
		System.out.println(Arrays.toString(sortArray(arr)));                
	}
}
