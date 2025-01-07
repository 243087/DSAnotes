package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;

public class Program4_GivenArrayBuild_MinHeap_BruteForce {

	static ArrayList<Integer> build(ArrayList<Integer> al){
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<al.size();i++) {
			buildHeap(ans,al.get(i));
		}
		return ans;                                              //          TC = O[NlogN]        SC = O[N]
	}
	static void buildHeap(ArrayList<Integer> ans,int value) {
		ans.add(value);
		int lastIndex = ans.size()-1;
		
		while(lastIndex>0) {
			int parentIndex = (lastIndex-1)/2;
			if(ans.get(parentIndex)>ans.get(lastIndex)) {
				swap(ans,parentIndex,lastIndex);
				lastIndex = parentIndex;
			}
			else
				break;
		}
	}
	static void swap(ArrayList<Integer> ans, int parentIndex, int lastIndex) {
		int temp = ans.get(parentIndex);
		ans.set(parentIndex,ans.get(lastIndex));
		ans.set(lastIndex,temp);
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
		
		System.out.println(build(al));
	}
}
