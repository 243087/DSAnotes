package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;


//Problem Description
//Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents a point at coordinate (i, A[i]). N vertical lines are 
//drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0). Find two lines, which together with x-axis forms a container,
//such that the container contains the most water. You need to return this maximum area.

//Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
public class Program2_Assignment1BruteForce {

	static int maxArea(int []arr) {
		int maxArea = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int height = Math.min(arr[i],arr[j]);
				int width = j-i;
				int area = height*width;
				maxArea = Math.max(maxArea,area);
			}
		}
		return maxArea;                                            //       TC = O[N^2]
	}
	public static void main(String[] args) {
		int []arr = {5,2,4,7,3,1,6,4,2};
		System.out.println(maxArea(arr));
	}
}
