package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Program4_GivenArrayBuild_MinHeap {

	static ArrayList<Integer> buildHeap(ArrayList<Integer> al){
		
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<al.size();i++) {
			pq.add(al.get(i));                       //  insertion and deletion is heap takes TC = O[logN]
		}                                            //  loop is running n times so    TC = O[NlogN]
		for(int i=0;i<al.size();i++) {
			ans.add(pq.remove());
		}
		return ans;                             //      TC = O[NlogN]
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(13);
		al.add(-2);
		al.add(11);
		al.add(27);
		al.add(31);
		al.add(0);
		al.add(19);
		
		System.out.println(buildHeap(al));
	}
}
