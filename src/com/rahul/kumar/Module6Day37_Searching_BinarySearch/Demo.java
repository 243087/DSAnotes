package com.rahul.kumar.Module6Day37_Searching_BinarySearch;

import java.util.HashMap;

public class Demo {

	static int findElement(int []arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			
			if(!hm.containsKey(key))
				hm.put(key,1);
			else {
				int freq = hm.get(key);
				hm.put(key,freq+1);
			}
		}
		System.out.println(hm);
		for(Integer i : hm.keySet()) {
			if(hm.get(i)==1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {8,8,5,5,9,9,6,2,2,4,4};
		System.out.println(findElement(arr));
		
	}
}
