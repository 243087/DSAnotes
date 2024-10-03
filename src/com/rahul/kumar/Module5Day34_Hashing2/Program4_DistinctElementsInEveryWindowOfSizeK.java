package com.rahul.kumar.Module5Day34_Hashing2;

import java.util.HashSet;

public class Program4_DistinctElementsInEveryWindowOfSizeK {

	static void countDistinctElement(int []arr, int k) {
		int s = 0;
		for(int e=k-1;e<arr.length;e++) {
			HashSet<Integer> hs = new HashSet<>();
			for(int i=s;i<=e;i++) {
				hs.add(arr[i]);
			}
			System.out.println(hs.size());                           //   TC = O[N*K]   
			s++;
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,1,3,5,2,1};
		int windowSize = 3;
		countDistinctElement(arr,windowSize);
		
	}
}
