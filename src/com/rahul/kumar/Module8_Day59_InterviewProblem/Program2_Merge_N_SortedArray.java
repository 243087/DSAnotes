package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program2_Merge_N_SortedArray {

	static int []mergerArray(int [][]arr){
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				al.add(arr[i][j]);                      // there are N sorted arrays, and each array has K element on average 
			}                                           // and iterating through all array to add element to ans take  TC = O[N*K]
		}
		Collections.sort(al);
		System.out.println(al);
		int []ans = new int[al.size()];
		for(int i=0;i<ans.length;i++) {
			ans[i] = al.get(i);
		}
		
		Arrays.sort(ans);                               //  Sorting takes TC = O[NlogN]   
		return ans;                                     //   TC = O[N*KLog(N*K)]      OR    TC = O[XLogX]   where X = total element
	}
	public static void main(String[] args) {
		int [][]arr = {{2,3,11,15,20},{1,5,7,9},{0,2,4},{3,4,5,6,7,8},{-2,5,10,20}};
		System.out.println(Arrays.toString(mergerArray(arr)));
	}
}
