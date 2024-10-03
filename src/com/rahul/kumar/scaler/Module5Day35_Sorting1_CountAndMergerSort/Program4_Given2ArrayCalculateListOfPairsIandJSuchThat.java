package com.rahul.kumar.scaler.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.ArrayList;

public class Program4_Given2ArrayCalculateListOfPairsIandJSuchThat {

	static void pairsList(int []arr1,int []arr2) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]>arr2[j]) {
					ArrayList<Integer> inner = new ArrayList<>();
					inner.add(arr1[i]);
					inner.add(arr2[j]);
					al.add(inner);
				}
			}
		}
		System.out.println(al);                        //                    TC = O[N*M]    
	}
	public static void main(String[] args) {
		int []arr1 = {7,3,5};
		int []arr2 = {2,0,6};
		pairsList(arr1,arr2);
	}
}
