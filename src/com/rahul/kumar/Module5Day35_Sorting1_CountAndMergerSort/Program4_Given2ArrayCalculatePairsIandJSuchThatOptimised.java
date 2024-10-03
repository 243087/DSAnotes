package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

////Given two array, A[ n ] and B[ m ]. Calculate number of pairs i , j such that A[ i ] > B[ j ].
public class Program4_Given2ArrayCalculatePairsIandJSuchThatOptimised {

	static int checkPairs(int []arr1,int []arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int a = 0;
		int b = 0;
		int pairs = 0;
		while(a<arr1.length && b<arr2.length) {
			if(arr1[a]>arr2[b]) {
				b++;
				pairs += arr1.length - a;
			}
			else {
				a++;
			}
		}
		return pairs;                                 //          TC = O[NlogN + MlogM]        SC = depends
	}
	public static void main(String[] args) {
		int []arr1 = {7,3,5};
		int []arr2 = {2,0,6};
		System.out.println(checkPairs(arr1,arr2));
	}
}
