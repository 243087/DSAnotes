package com.rahul.kumar.Module5Day30_Recursion2;

import java.util.ArrayList;

// <Problem Description> : On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace 
//                         each occurrence of 0 with 01, and each occurrence of 1 with 10.
//                         Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed).
public class Program0_AdditionalAssignment_Kth_Symbol {

	static int kthSymbol(int A, int B) {
		ArrayList<Integer> ans = helper(A);
		System.out.println("Printing the arraylist"+ans);
		return ans.get(B);
	}
	static ArrayList<Integer> helper(int A){
		if(A==1) {
			ArrayList<Integer> base = new ArrayList<>();
			base.add(0);
			return base;
		}
		
		ArrayList<Integer> arr = helper(A-1);
		ArrayList<Integer> curr = new ArrayList<>();
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==0) {
				curr.add(0);
				curr.add(1);
			}
			else {
				curr.add(1);
				curr.add(0);
			}
		}
		return curr;
	}
	public static void main(String[] args) {
		int A = 4;
		int B = 4;
		System.out.println(kthSymbol(A,B));
	}
}
