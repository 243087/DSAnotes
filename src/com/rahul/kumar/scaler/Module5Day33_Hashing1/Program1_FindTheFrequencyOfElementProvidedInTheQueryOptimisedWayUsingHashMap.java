package com.rahul.kumar.scaler.Module5Day33_Hashing1;

import java.util.HashMap;

//Given N elements & Q queries. Find the frequency of elements provided in the query.
public class Program1_FindTheFrequencyOfElementProvidedInTheQueryOptimisedWayUsingHashMap {

	static void countFrequency(int []arr, int[]query) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			if(hm.containsKey(key) == false) {
				hm.put(key,1);
			}
			else {
				int freq = hm.get(key);
				hm.put(key,freq+1);
			}
		}
		for(int j=0;j<query.length;j++) {
			int value = query[j];
			if(hm.containsKey(value)==false) {
				System.out.println(0);
			}
			else {
				System.out.println(hm.get(value));                  //           TC = O[Q+N]         SC = O[N]
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {2,6,3,8,2,8,2,3,8,10,6};
		int []query = {2,8,3,5};
		
		countFrequency(arr,query);
	}
}
