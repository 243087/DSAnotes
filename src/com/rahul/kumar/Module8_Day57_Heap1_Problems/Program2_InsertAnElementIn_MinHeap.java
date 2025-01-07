package com.rahul.kumar.Module8_Day57_Heap1_Problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program2_InsertAnElementIn_MinHeap {

    static ArrayList<Integer> insert(ArrayList<Integer> al, int value) {
    	al.add(value);
    	int last = al.size()-1;
    	
    	while(last>0) {
    		int parentIndex = (last-1)/2;
    		if(al.get(parentIndex)>al.get(last)) {
    			swap(al,parentIndex,last);
    			last = parentIndex;
    		}
    		else
    			break;
    	}
    	return al;                                           //             TC = O[logN]
    }
    static void swap(ArrayList<Integer> al, int p, int l) {
        int temp = al.get(p);
        al.set(p, al.get(l));
        al.set(l, temp);
    }
	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>();
		al.add(5);
		al.add(12);
		al.add(20);
		al.add(25);
		al.add(13);
		al.add(24);
		al.add(22);
		al.add(35);
		
		int value = 10;
		System.out.println(insert(al,value));
	}
}
