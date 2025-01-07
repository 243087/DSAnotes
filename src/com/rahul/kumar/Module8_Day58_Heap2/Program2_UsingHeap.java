package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2_UsingHeap {

	static int findKth(ArrayList<Integer> al, int k) {
		buildHeap(al);
        int last = al.size()-1;
        while(last>0) {
        	swap(al,0,last);
        	last--;
        	heapify(al,0,last);
        }
        return al.get(al.size()-k);                            //    TC = O[NlogN]      SC = O[1] 
	}
	static void buildHeap(ArrayList<Integer> al) {
		int n = al.size();
		for(int i=(n-2)/2;i>=0;i--) {
			heapify(al,i,n);
		}
	}
	static void heapify(ArrayList<Integer> al,int index,int size) {
		while(2*index+1<size) {
			int leftChild = 2*index+1;
			int rghtChild = 2*index+2;
			
			int max = Math.max(al.get(index),Math.max(safeGet(al,leftChild,size),safeGet(al,rghtChild,size)));
			if(max==al.get(index))
				break;
			if(max==safeGet(al,leftChild,size)) {
				swap(al,index,leftChild);
				index = leftChild;
			}
			else {
				swap(al,index,rghtChild);
				index = rghtChild;
			}
		}
	}
	static void swap(ArrayList<Integer> al, int p, int c) {
		int temp = al.get(p);
		al.set(p,al.get(c));
		al.set(c,temp);
	}
	static int safeGet(ArrayList<Integer> al, int p, int c) {
		if(0<=p && p<c)
			return al.get(p);
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>(Arrays.asList(8,5,1,2,4,9,7));
		 int k = 4;
	        System.out.println("Sorted Array: " + findKth(al,k));
	}
}
