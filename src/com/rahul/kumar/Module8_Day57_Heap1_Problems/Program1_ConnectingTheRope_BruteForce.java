package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;
import java.util.Collections;

// Given an array that represents the size of different ropes. In a single operation, you can connect two ropes. Cost of connecting 2 
// ropes is sum of the ropes of length of the ropes you are connecting. Find the minimum cost of connecting all the ropes.
public class Program1_ConnectingTheRope_BruteForce {

	static int minCost(ArrayList<Integer> al) {
		int cost = 0;
		
		while(al.size()>1) {
		Collections.sort(al);                      //      for sorting TC = O[NlogN]
		int first = al.remove(0);
		int second = al.remove(0);
		
		cost += first+second;
		al.add(first+second);
		}
		return cost;                               //        TC = O[N^2LogN]
	}
	public static void main(String[] args) {
	 ArrayList<Integer> al = new ArrayList<>();
	 al.add(2);
	 al.add(5);
	 al.add(3);
	 al.add(2);
	 al.add(6);
	 
	 System.out.println("Minimum cost to connect all ropes: "+minCost(al));
	}
}
