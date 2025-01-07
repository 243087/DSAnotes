package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;

public class Program4_GivenArrayBuild_MinHeap_Optimised {

	static ArrayList<Integer> buildHeap(ArrayList<Integer> al){
		int n = al.size();
		                                                               // last node of the heap tree index is n-1
		for(int i=(n-2)/2;i>=0;i--) {                                  // we have to heapify from last non-leaf node
		      heapify(al,i);                                           //last non-leaf node is the parent of the last node of heap tree
		}                                                              // last non-leaf node's index = ((n-1)-1)/2 = (n-2)/2
		return al;
	}
	static void heapify(ArrayList<Integer> arr, int index) {
		int N = arr.size();
		
		while(2*index+1<N) {                                     //         TC = O[N]
			int leftChild = 2*index+1;
			int rightChild = 2*index+2;
			int minValue = Math.min(arr.get(index),Math.min(safeGet(arr,leftChild),safeGet(arr,rightChild)));
			
			if(minValue==arr.get(index))
				break;
			if(minValue==safeGet(arr,leftChild)) {
				swap(arr,index,leftChild);
			    index = leftChild;
			}
			else {
				swap(arr,index,rightChild);
				index = rightChild;
			}
		}
	}
	 static void swap(ArrayList<Integer> A, int i, int j) {
	        int temp = A.get(i);
	        A.set(i, A.get(j));
	        A.set(j, temp);
	    }
	static int safeGet(ArrayList<Integer> A, int index) {
     if (0 <= index && index < A.size()) {
         return A.get(index);
     }
     return Integer.MAX_VALUE;
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
