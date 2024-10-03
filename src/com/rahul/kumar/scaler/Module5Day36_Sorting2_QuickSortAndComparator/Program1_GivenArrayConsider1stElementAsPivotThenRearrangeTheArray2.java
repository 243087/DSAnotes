package com.rahul.kumar.scaler.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.Arrays;

public class Program1_GivenArrayConsider1stElementAsPivotThenRearrangeTheArray2 {

	static int []pivotArray(int []arr){
		int pivotElement = arr[0];
		int l = 1;
		int r = arr.length-1;
		
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
		swap(arr,0,r);
		return arr;
	}
	static void swap(int []arr,int l,int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	public static void main(String[] args) {
		int []arr = {54,26,93,17,77,31,44,55,20};
		System.out.println(Arrays.toString(pivotArray(arr)));                   //      TC = O[N]        SC = O[1] 
	}
}
