package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;

public class Program5_GivenArrayFindOutTheCountOfLeastNumberOfElementOccurances {

	static void leastParticipation(int []arr) {
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
		
		int minFreq = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int value = hm.get(arr[i]);
			minFreq = Math.min(value,minFreq);
		}
		int ans =0;
		for(Integer count : hm.values()) {	
			if(count==minFreq)
				ans++;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int []arr = {101,102,103,101,102,101,104,105,106,105,105};
		leastParticipation(arr);
		
	}
}
