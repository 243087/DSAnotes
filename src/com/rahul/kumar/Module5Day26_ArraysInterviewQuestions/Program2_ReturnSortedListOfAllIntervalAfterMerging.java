package com.rahul.kumar.Module5Day26_ArraysInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

// <Question>: Given a set of non-overlapping interval in form id A[][]. Also given a new interval [start][end]. Task is to 
//             insert this new [start][end] interval into the A[][].
//  Note     : Intervals were initially sorted based on the start time.

public class Program2_ReturnSortedListOfAllIntervalAfterMerging {

	static void mergeInterval(int [][]arr,int []interval) {
		// first need to insert interval array into arr, for adding to find at what index we need to insert into arr
		int index =arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]>interval[0]) {
				index = i;
				break;
			}
		}
		
		 ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		 ArrayList<Integer> subList = new ArrayList<>();
		 for(int i=0;i<arr.length;i++) {
			 ArrayList<Integer> al1 = new ArrayList<>();
                 al1.add(arr[i][0]);
                 al1.add(arr[i][1]);
                 al.add(al1);
		 }
		 System.out.println(al);
		 for(int i=0;i<interval.length;i++) {
			subList.add(interval[i]);
		 }
		 al.add(index,subList);
		 //  Now implement the same logic as previous one
		 
		 int cs = al.get(0).get(0);
		 int ce = al.get(0).get(1);
		 
		 for(int i=1;i<al.size();i++) {
			 int s = al.get(i).get(0);
			 int e = al.get(i).get(1);
			 if(ce>=s) {
				 cs = Math.min(cs,s);
				 ce = Math.max(ce,e);
			 }
			 else {
				 System.out.println(cs+","+ce);
				 cs =s;
				 ce =e;
			 }
		 }
		 System.out.println(cs+","+ce);                             //  TC = O[N]                 
		 		 
	}
	public static void main(String[] args) {
		int [][]arr = {{4,7},{10,14},{16,19},{21,24},{27,30}};
		int [] newInterval = {12,22};
		
		mergeInterval(arr,newInterval);
	}
}
