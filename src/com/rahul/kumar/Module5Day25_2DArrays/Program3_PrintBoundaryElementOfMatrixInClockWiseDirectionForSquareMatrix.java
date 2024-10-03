package com.rahul.kumar.Module5Day25_2DArrays;

public class Program3_PrintBoundaryElementOfMatrixInClockWiseDirectionForSquareMatrix {

	static void printBoundary(int [][]arr) {
		int r=0;
		int c=0;
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[r][c]+" ");
			c++;
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[r][c]+" ");
			r++;
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[r][c]+" ");
			c--;
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[r][c]+" ");
			r--;
		}
		
		
		// for edge case
		if(arr.length<1)
			System.out.print(arr[r][c]);
	}
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4,5},
				       {6,7,8,9,10},
				       {11,12,13,14,15},
				       {16,17,18,19,20},
				       {21,22,23,24,25}};
		printBoundary(arr);
	}
}
