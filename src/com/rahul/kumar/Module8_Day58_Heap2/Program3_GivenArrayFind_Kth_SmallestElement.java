package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Program3_GivenArrayFind_Kth_SmallestElement {

	static int findKth(int []arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			if(pq.size()>k) {
				pq.remove();
			}
		}
		return pq.peek();
	}
	public static void main(String[] args) {
		int []arr = {8,5,1,2,4,9,7};
		int k = 1;
		System.out.println(findKth(arr,k));
	}
}
