package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.PriorityQueue;

public class Program1_ConnectingTheRope_Optimised {

	static int minCost(int []arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);                       //   adding element to heap takes O[logN] and adding n element so O[NlogN]
		}
		int cost = 0;
		while(minHeap.size()>1) {
			int first = minHeap.poll();
			int second = minHeap.poll();
			
			cost += first + second;
			minHeap.add(first+second);
		}
		return cost;                                                     //     TC = O[NlogN]
	}
	public static void main(String[] args) {
		int []arr = {2,5,3,2,6};
		System.out.println(minCost(arr));
	}
}
