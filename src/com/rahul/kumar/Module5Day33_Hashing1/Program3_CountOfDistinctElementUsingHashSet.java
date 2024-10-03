package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashSet;

public class Program3_CountOfDistinctElementUsingHashSet {

	static void countDistinctElement(int []arr) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			hs.add(key);
		}
		System.out.println(hs.size());                      //            TC = O[N]              SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {3,5,6,5,4};
		countDistinctElement(arr);
	}
}
