package com.rahul.kumar.Module4Day18Array2DMatrix;

import java.util.Arrays;

public class Program6RotateTheSquareMatrixBy90Degree {

	static void matrixRotate(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				swap(arr,i,j);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(Arrays.toString(reverseArray(arr[i])));
			System.out.println();
		}
	}
	static void swap(int [][]A, int row, int col) {
		int temp = A[row][col];
		A[row][col] = A[col][row];
		A[col][row] = temp;
	}
	static int [] reverseArray(int []A) {
	     int start = 0;
	     int end = A.length-1;
	     while(start<end) {
	    	 int temp = A[start];
	    	 A[start] = A[end];
	    	 A[end] = temp;
	    	 start++;
	    	 end--;
	     }
	     return A;
	}
	
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixRotate(arr); 
	}
}
