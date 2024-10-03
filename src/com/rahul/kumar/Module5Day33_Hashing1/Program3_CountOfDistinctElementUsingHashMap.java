package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;
// Count of distinct elements


public class Program3_CountOfDistinctElementUsingHashMap {

	static void countDistinctElement(int []arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			if(hm.containsKey(key)==false) {
				hm.put(key,1);
			}
			else {
				int freq = hm.get(key);
				hm.put(key,freq+1);
			}
		}
		System.out.println(hm.size());                              //            TC = O[N]        SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {3,5,6,5,4};
		countDistinctElement(arr);
	}
}
