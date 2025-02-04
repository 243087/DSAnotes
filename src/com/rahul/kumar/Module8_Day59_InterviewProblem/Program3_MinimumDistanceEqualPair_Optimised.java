package com.rahul.kumar.Module8_Day59_InterviewProblem;

//< Question > : Given an array A, find a pair of indices (i, j) such that A[i] = A[j] and the absolute difference |i - j| is 
//               minimized. In simpler terms, you need to find two equal elements in the array that are the closest to each other 
//               and return the minimum distance between them.
import java.util.ArrayList;
import java.util.HashMap;

public class Program3_MinimumDistanceEqualPair_Optimised {

	static int findMinDistane(int []arr) {
		
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
		int minDistance = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int val = arr[i];
			ArrayList<Integer> list = hm.getOrDefault(val,new ArrayList<>());
			list.add(i);
			hm.put(val,list);
		}                                                            //           TC = O[N]         SC = O[N]
		
 	/*	for (int i = 0; i < arr.length; i++) {
		    int val = arr[i];
		    
		    if (hm.containsKey(val)) {
		        ArrayList<Integer> list = hm.get(val);
		        list.add(i);
		    } else {
		        ArrayList<Integer> list = new ArrayList<>();
		        list.add(i);
		        hm.put(val, list);
		    }
		}  */
		
		
		 // Find the minimum distance between indices of the same element
		for(ArrayList<Integer> list : hm.values()) {
			for(int i=1;i<list.size();i++) {
				int distance = list.get(i) - list.get(i-1);
				minDistance = Math.min(distance,minDistance);
			}
		}
		if (minDistance == Integer.MAX_VALUE) {
		    return -1;
		} else {
		    return minDistance;
		}
	}
	public static void main(String[] args) {
		int []arr = {7,1,3,4,1,7};
		System.out.println(findMinDistane(arr));
	
	}
}
