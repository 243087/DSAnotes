package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;

//Problem Description
//Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents a point at coordinate (i, A[i]). N vertical lines are 
//drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0). Find two lines, which together with x-axis forms a container,
//such that the container contains the most water. You need to return this maximum area.

//Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
public class Program2_Assignment1TwoPointers {

	static int maxArea(int []arr) {
		int maxArea = 0;
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			int height = Math.min(arr[l],arr[r]);
			int width = r-l;
			maxArea = Math.max(maxArea,height*width);
			if(arr[l]<arr[r])
				l++;
			else
				r--;
		}
		return maxArea;                                     //               TC = O[N]   SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {5,2,4,7,3,1,6,4,2};
		System.out.println(maxArea(arr));
	}
}
