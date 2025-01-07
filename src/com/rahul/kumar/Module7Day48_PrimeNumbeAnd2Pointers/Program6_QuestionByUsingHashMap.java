package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.HashMap;

//< Question > : Find count of all the pairs in a sorted array whose sum is K. ( i != j )
public class Program6_QuestionByUsingHashMap {

	static int countPairs(int []arr,int find) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
			int need = find - a;
			
			if(hm.containsKey(need))
				count += hm.get(need);
			
			if(hm.containsKey(a))
				hm.put(a,hm.get(a)+1);
			else
				hm.put(a,1);
		}
		return count;                                           //          TC = O[N]      SC = O[N]
	}
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 4, 5, 6, 6, 6, 7, 10 };
		int find = 10;
		System.out.println(countPairs(arr, find));
	}
}
