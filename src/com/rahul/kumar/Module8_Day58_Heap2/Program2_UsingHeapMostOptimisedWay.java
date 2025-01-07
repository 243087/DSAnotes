package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// < Question > :  Given arr[ N ]. Find Kth largest element.
public class Program2_UsingHeapMostOptimisedWay {

	static int findKth(ArrayList<Integer> al, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<al.size();i++) {
			pq.add(al.get(i));
			if(pq.size()>k) {
				pq.remove();
			}
		}
		return pq.peek();                                     //          TC = O[NlogK]       SC = O[K]
	}
	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>(Arrays.asList(8,5,1,2,4,9,7));
		 int k = 3;
	        System.out.println("Sorted Array: " + findKth(al,k));
	}
}

//Note : If we have to ever maintain the kth largest/smallest element then use the above technique 