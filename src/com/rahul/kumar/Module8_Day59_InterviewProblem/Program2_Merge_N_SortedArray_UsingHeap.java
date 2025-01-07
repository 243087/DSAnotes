package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Program2_Merge_N_SortedArray_UsingHeap {

	static int []mergerArray(int [][]arr){
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			queue.add(arr[i][j]);
		}
	}
	int []ans = new int[queue.size()];

	for(int i=0;i<ans.length;i++) {
		ans[i] = queue.remove();
	}
	return ans;
}
public static void main(String[] args) {
	int [][]arr = {{2,3,11,15,20},{1,5,7,9},{0,2,4},{3,4,5,6,7,8},{-2,5,10,20}};
	System.out.println(Arrays.toString(mergerArray(arr)));
}
}
