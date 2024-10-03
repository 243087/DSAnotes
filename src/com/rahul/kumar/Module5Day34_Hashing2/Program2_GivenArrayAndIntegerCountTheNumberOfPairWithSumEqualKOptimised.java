package com.rahul.kumar.Module5Day34_Hashing2;

import java.util.HashMap;

public class Program2_GivenArrayAndIntegerCountTheNumberOfPairWithSumEqualKOptimised {

	static int countPair(int []arr,int num) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int need = num - arr[i];
			if(hm.containsKey(need)) {
				count += hm.get(need);
			}
			
			if(hm.containsKey(arr[i])== false) {
				hm.put(arr[i],1);
			}
			else {
				int freq = hm.get(arr[i]);
				hm.put(arr[i],freq+1);
			}
		}
		return count;                                             //            TC = O[N]             SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {2,5,2,5,8,5,2,8};
		int num = 10;
		System.out.println(countPair(arr,num));
	}
}
