package com.rahul.kumar.scaler.Module5Day33_Hashing1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Program5_GivenArrayFindOutTheListOfLeastNumberOfElementOccurances {

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
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			int check = arr[i];
			if(hm.get(check) == minFreq) {
				hs.add(check);
			}
		}
		System.out.println(hs);
	}
	public static void main(String[] args) {
		int []arr = {101,102,103,101,102,101,104,105,106,105,105};
		leastParticipation(arr);
		
	}
}
