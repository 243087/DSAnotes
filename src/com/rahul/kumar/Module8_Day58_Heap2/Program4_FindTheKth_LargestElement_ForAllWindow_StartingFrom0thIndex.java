package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// < Question > : Kth largest element for all the windows starting from 0th idx.
public class Program4_FindTheKth_LargestElement_ForAllWindow_StartingFrom0thIndex {

	static ArrayList<Integer> findKth(ArrayList<Integer> al,int k){
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<al.size();i++) {
			pq.add(al.get(i));
			if(pq.size()<k)
				ans.add(-1);
			if(pq.size()>k) 
				pq.remove();
			
			if(pq.size()==k)
				ans.add(pq.peek());
		}
		return ans;                               //               TC = O[NlogK]         SC = O[K]
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,18,7,5,16,19,3));
		int k = 3;
		System.out.println(findKth(al,k));
		
	}
}
