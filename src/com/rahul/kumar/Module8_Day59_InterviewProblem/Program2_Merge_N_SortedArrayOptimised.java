package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Program2_Merge_N_SortedArrayOptimised {

	static int []mergerArray(int [][]arr){
		PriorityQueue<Triplet> queue = new PriorityQueue<>();
		int totalElement = 0;
		
		for(int i=0;i<arr.length;i++) {
			queue.add(new Triplet(arr[i][0],i,0));
			totalElement += arr[i].length;
		}
		
		int []ans = new int [totalElement];
		int index = 0;
		
		while(!queue.isEmpty()) {
			Triplet tp = queue.remove();
			int value = tp.value;
			int arrIndex = tp.arrIndex;
			int valueIndex = tp.valueIndex;                              //        TC = O[(N+X)logN]      SC = N
			
			ans[index++] = value;
			if(valueIndex+1<arr[arrIndex].length) {
				queue.add(new Triplet(arr[arrIndex][valueIndex+1],arrIndex,valueIndex+1));
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int [][]arr = {{2,3,11,15,20},{1,5,7,9},{0,2,4},{3,4,5,6,7,8},{-2,5,10,20}};
		System.out.println(Arrays.toString(mergerArray(arr)));
	}
}
