package com.rahul.kumar.scaler.Module5Day34_Hashing2;

import java.util.ArrayList;
import java.util.HashMap;

public class Program4_DistinctElementsInEveryWindowOfSizeKUsingHashMap {

	static void countDistinctElement(int []arr,int k) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			int key = arr[i];
			if(hm.containsKey(key)==false)
				hm.put(key,1);
			else {
				int freq = hm.get(key);
				hm.put(key,freq+1);
			}
		}
		al.add(hm.size());
		int s = 1;
		int e = k;
		while(e<arr.length) {
			// Remove arr[s-1] from window
			int value = arr[s-1];
			hm.put(value,hm.get(value)-1);
			if(hm.get(value)==0) {
				hm.remove(value);
			}
			
			int value1 = arr[e];
			if(hm.containsKey(value1)==false)
				hm.put(value1,1);
			else {
				int freq = hm.get(value1);
				hm.put(value1,freq+1);
			}
			al.add(hm.size());
			s++;
			e++;
		}
		System.out.println(al);
	}
	public static void main(String[] args) {
		int []arr = {1,2,1,3,5,2,1};
		int windowSize = 3;
		countDistinctElement(arr,windowSize);
	}
}
