package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Demo {

	 public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        ArrayList<Integer> ans = new ArrayList<>();
	        for(int i = 0;i<=B;i++){
	            minHeap.add(A.get(i));
	        }
	        for(int i = 0;i<A.size();i++){
	            ans.add(minHeap.poll());
	            if(i+B+1<A.size()){
	                minHeap.add(A.get(i+B+1));
	            }
	           
	        }
	        return ans;
	    }
	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 1, 17, 10, 21, 95));
        int B = 1;
		System.out.println(solve(A,B));
	}
}
