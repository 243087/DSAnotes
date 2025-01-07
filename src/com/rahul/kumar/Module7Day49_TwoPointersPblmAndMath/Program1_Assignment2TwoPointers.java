package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

//Question
//Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B. If the answer 
//does not exist return an array with a single integer "-1". First sub-array means the sub-array for which starting index in minimum.
public class Program1_Assignment2TwoPointers {

	static ArrayList<Integer> subSum(ArrayList<Integer> A, int B){
		
		ArrayList<Long> alPrefix = new ArrayList<>();
		alPrefix.add(0L);
		for(int i=0;i<A.size();i++) {
			alPrefix.add(A.get(i)+alPrefix.get(i));
		}

		int l = 0;
		int r = 1;
        while(r<alPrefix.size()) {
        	long diff = alPrefix.get(r) - alPrefix.get(l);
        	if(diff == B) {
        		ArrayList<Integer> ans = new ArrayList<>();
        		for(int i=l;i<r;i++) {
        			ans.add(A.get(i));
        		}
        		return ans;
        	}
        	else if(diff>B)
        		l++;
        	else
        		r++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        return ans;
	}
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		Collections.addAll(A,5,7,3,2,8,6,9,4,2);
		int B = 13;
		
		ArrayList<Integer> result = subSum(A,B);
		System.out.println(result);
	}
}
