package com.rahul.kumar.Module6Day42_Stack2;

import java.util.Arrays;
import java.util.Stack;

public class Program6_NearestSmallerOrEqualElementOnRightOptimised {

	static int [] nearestIndex(int []arr) {
		int [] ansArr = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ansArr[i] = arr.length;
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
