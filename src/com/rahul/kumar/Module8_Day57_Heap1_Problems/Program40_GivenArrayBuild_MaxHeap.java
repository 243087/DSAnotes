package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Program40_GivenArrayBuild_MaxHeap {

	static ArrayList<Integer> maxHeap(ArrayList<Integer> arr){
		int n = arr.size();
		for(int i=(n-2)/2;i>=0;i--) {
			heapify(arr,i);
		}
		return arr;
	}
	static void heapify(ArrayList<Integer> al, int index) {
		int N = al.size();
		while(2*index+1<N) {
			int leftChild = 2*index+1;
			int rghtChild = 2*index+2;
			
			int maxValue = Math.max(al.get(index),Math.max(safeGet(al,leftChild),safeGet(al,rghtChild)));
			if(maxValue==al.get(index))
				 break;
			if(maxValue==safeGet(al,leftChild)) {
				swap(al,index,leftChild);
				index = leftChild;
			}
			else {
				swap(al,index,rghtChild);
				index = rghtChild;
			}
		}
	}
	static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
	static int safeGet(ArrayList<Integer> al, int index) {
		if(index>=0 && index<al.size()) {
			return al.get(index);
		}
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(14, 13, 10, 7, 6, 8, 5, 2, 1, 3));
        System.out.println("Sorted Array: " + maxHeap(al));
    }
}
