package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.util.ArrayList;

public class Program3_RemoveMinElementIn_MinHeap_Or_ExtractMin {

	static int extractMin(ArrayList<Integer> A) {
		int first = 0;
		int last = A.size()-1;
		swap(A,first,last);
		int ans = A.remove(last);
		heapify(A,first);
		return ans;                                          //       TC = O[logN]
	}
	static void heapify(ArrayList<Integer> arr, int index) {
		int N = arr.size();
		
		while(2*index+1<N) {
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
		ArrayList<Integer> minHeap = new ArrayList<>();
        minHeap.add(2);
        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(11);
        minHeap.add(6);
        minHeap.add(7);
        minHeap.add(8);
        minHeap.add(20);
        minHeap.add(12);

        System.out.println("Extracted min: " + extractMin(minHeap));
        System.out.println("Heap after extraction: " + minHeap);
	}
}
