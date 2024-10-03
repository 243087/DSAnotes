package com.rahul.kumar.scaler.Module6Day42_Stack2;

import java.util.Arrays;
import java.util.Stack;

public class Program2_NearestSmallerOrEqualElementOnLeftOptimised {

	static int [] nearestIndex(int []arr) {
		int [] ansArr = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ansArr[i] = -1;
			}
			else {
				ansArr[i] = st.peek();
			}
			st.push(i);
		}
		return ansArr;                                    //         TC = O[N]           SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {4,5,2,10,3,2};
		System.out.println(Arrays.toString(nearestIndex(arr)));
	}
}
