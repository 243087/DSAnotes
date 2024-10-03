package com.rahul.kumar.Day11_HashSetHashMap;

import java.util.HashSet;

public class Program1PerformAllTheBasicOperationOfHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs  = new HashSet<>();
		hs.add(100);
		hs.add(2);
		hs.add(4);
		hs.add(100);
		
		System.out.println("Print the HashSet before removing element"+hs);
		System.out.println(hs.contains(100));
		 hs.remove(100);
		System.out.println("Print the HashSet after removing element"+hs);
		
		for(int print:hs) {
			System.out.println(print);
		}
	}
}
