package com.rahul.kumar.scaler.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.Arrays;

public class Program1_GivenArrayConsider1stElementAsPivotThenRearrangeTheArray1 {

	static int[] pivotArray(int []arr){
		int pivotElement = arr[0];
		int []ans = new int [arr.length];
		
		int index =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<pivotElement)
				ans[index++] = arr[i];
		}
		ans[index++] = pivotElement;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>pivotElement)
				ans[index++] = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int []arr = {54,26,93,17,77,31,44,55,20};
		System.out.println(Arrays.toString(pivotArray(arr)));                   //      TC = O[N]        SC = O[N] 
	}
}
