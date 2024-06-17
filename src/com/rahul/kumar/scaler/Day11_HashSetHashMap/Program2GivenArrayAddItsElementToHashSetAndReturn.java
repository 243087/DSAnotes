package com.rahul.kumar.scaler.Day11_HashSetHashMap;

import java.util.HashSet;

public class Program2GivenArrayAddItsElementToHashSetAndReturn {

	static HashSet<Integer> returnHashSet(int [] arr){
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		return hs;
	}
	public static void main(String[] args) {
		int [] arr = {1,3,-2,7,1,1,-2};
		System.out.println(returnHashSet(arr));
	}
}
