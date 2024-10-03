package com.rahul.kumar.scaler.Day11_HashSetHashMap;

import java.util.HashSet;

public class Program3GivenTwoHashSetAsInputPrintTheirCommonElement {
	
	static void printCommonElement(HashSet<Integer> hs1,HashSet<Integer> hs2) {
	for(Integer print:hs1) { 
		if(hs2.contains(print)) {
			System.out.print(print+" ");
		}
	  }
	}
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(0);
		hs1.add(-2);
		hs1.add(4);
		hs1.add(10);
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(1);
		hs2.add(-2);
		hs2.add(3);
		hs2.add(5);
		hs2.add(4);
		
		System.out.println("Printing the 1st HashSet "+hs1);
		System.out.println("Printing the 2nd HashSet "+hs2);
		
		printCommonElement(hs1,hs2);
		
	}
}
