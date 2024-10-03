package com.rahul.kumar.Day11_HashSetHashMap;

import java.util.HashMap;

public class Program5ReturnTheFrequencyCountOfElementOfArray {

	static HashMap<Integer,Integer> freqCount(int []arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			if(hm.containsKey(arr[i])==false) {
				hm.put(key,1);
			}
			else {
				int freq = hm.get(key);
				hm.put(key,freq+1);
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		int []arr = {1,4,3,-2,1,1,4,5,3};
		System.out.println(freqCount(arr));
	}
}
