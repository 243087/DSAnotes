package com.rahul.kumar.Module6Day42_Stack2;

import java.util.Stack;

//<Question> : Find the largest area of rectangle ( formed by continuous bars ) in histogram.
public class Program9_LargestAreaOfRectangle_Optimised {

	static int maxArea(int []arr) {
		int [] nsl = nearestSmallerOnLeft(arr);
		int [] nsr = nearestSmallerOnRight(arr);
		int maxArea = 0;
		
		for(int i=0;i<arr.length;i++) {
			int height = arr[i];
			int l = nsl[i];
			int r = nsr[i];
			int width = r-l-1;
			int area = height*width;
			maxArea = Math.max(maxArea,area);                      //           TC = O[N]      SC = O[N]
		}
		return maxArea;
	}
	static int [] nearestSmallerOnLeft(int []arr) {
		int []newArr = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<=arr[st.peek()])
				 st.pop();
			if(st.isEmpty())
				 newArr[i] = -1;
			else
				newArr[i] = st.peek();
			
			st.push(i);
		}
		return newArr;
	}
	static int [] nearestSmallerOnRight(int []arr) {
		int []newArr = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]<=arr[st.peek()])
				 st.pop();
			if(st.isEmpty())
				 newArr[i] = arr.length;
			else
				newArr[i] = st.peek();
			
			st.push(i);
		}
		return newArr;
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,2,1};
		System.out.println(maxArea(arr));
	}
}
