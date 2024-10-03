package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;

//Given two array, A[ n ] and B[ m ]. Calculate number of pairs i , j such that A[ i ] > B[ j ].

public class Program4_Given2ArrayCalculatePairsCountsIandJSuchThatByLinearSearch {

	static int checkPairs(int []arr1,int []arr2) {
		int pairs =0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]>arr2[j])
					pairs++;
			}                                               //             TC = O[N^2]           SC = O[1]
		}
		return pairs;               //  all pairs are : (7>2, 7>0, 7>6, 3>2, 3>0, 5>2, 5>0)
	}
	public static void main(String[] args) {
		int []arr1 = {7,3,5};
		int []arr2 = {2,0,6};
		System.out.println(checkPairs(arr1,arr2));
	}
}
