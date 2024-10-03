package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;
//Given N elements. Find the first non-repeating element
public class Program2_FindFirstNonRepeatedElementOptimisedWay {

	static void firstNonRepeated(int []arr) {
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
		for(int i=0;i<arr.length;i++) {
		   int value = hm.get(arr[i]);
		   if(value == 1) {
			   System.out.println(arr[i]);
			   return;
		   }                                                          //            TC = O[N]          SC = O[N]
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,1,2,5};
		firstNonRepeated(arr);
	}
}
