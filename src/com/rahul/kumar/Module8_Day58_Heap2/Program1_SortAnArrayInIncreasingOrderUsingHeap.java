package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Program1_SortAnArrayInIncreasingOrderUsingHeap {

  static ArrayList<Integer> sortedHeap(ArrayList<Integer> al){
		
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<al.size();i++) {
			pq.add(al.get(i));                       //  insertion and deletion is heap takes TC = O[logN]
		}                                            //  loop is running n times so    TC = O[NlogN]
		for(int i=0;i<al.size();i++) {
			ans.add(pq.remove());
		}
		return ans;                             //      TC = O[NlogN]            SC = O[N]
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(14,13,10,7,6,8,5,2,1,3));
		System.out.println(sortedHeap(al));
		
	}
}
 