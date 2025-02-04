package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;

public class Program4_LongestSubArrayWithSumEqualToZero {

	static int subSum(int []arr) {
		int keySum = 0;
		int mazLength = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			keySum += arr[i];
			
			if(keySum==0)
				mazLength = i+1;
			if(!hm.containsKey(keySum))
				hm.put(keySum,i);
			else {
				int prevIdx = hm.get(keySum);
				mazLength = Math.max(mazLength,i-prevIdx);
			}
		}
		return mazLength;
	}
	public static void main(String[] args) {
		int []arr = {2,2,1,-3,4,3,1,-2,-3,2};
		System.out.println(subSum(arr));
	}
}
