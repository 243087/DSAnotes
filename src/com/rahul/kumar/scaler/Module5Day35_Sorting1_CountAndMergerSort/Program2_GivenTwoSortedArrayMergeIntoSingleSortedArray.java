package com.rahul.kumar.scaler.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

public class Program2_GivenTwoSortedArrayMergeIntoSingleSortedArray {

	static int [] mergeSort(int []arr1,int [] arr2) {
		int [] mergeArr = new int[arr1.length+arr2.length];
		
		int a =0;
		int b =0;
		int c =0;
		while(a<arr1.length && b<arr2.length) {
			if(arr1[a]<arr2[b]) {
				mergeArr[c] = arr1[a];
				c++;
				a++;
			}
			else {
				mergeArr[c] = arr2[b];
				c++;
				b++;
			}
		}  
		while(a<arr1.length) {
			mergeArr[c] = arr1[a];
			c++;
			a++;
		}
		while(b<arr2.length) {
			mergeArr[c] = arr2[b];
			c++;
			b++;
		}
		return mergeArr;                                  //         TC = O[N+M]            SC = O[N+M]
	}
	public static void main(String[] args) {
		int [] arr1 = {2,4,7,8,12};
		int [] arr2 = {3,5,6,7};
		System.out.println(Arrays.toString(mergeSort(arr1,arr2)));
	}
}
