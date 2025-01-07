package com.rahul.kumar.Module4Day18Array2DMatrix;

import java.util.Arrays;

public class Assignment3 {

	static int[][] diagonal(int [][]A){
		 int n = A.length;
	        int[][] arr = new int[n+n - 1][n];


	        for (int j = 0; j < n; j++) {
	            int row = 0;
	            int col = j;
	            int index = j;
	            while (row < n && col >= 0) {
	                arr[index][row] = A[row][col];
	                row++;
	                col--;
	            }
	        }

	 
	        for (int i = 1; i < n; i++) {
	            int row = i;
	            int col = n - 1;
	            int index = i + n - 1;
	            while (row < n && col >= 0) {
	                arr[index][row - i] = A[row][col];
	                row++;
	                col--;
	            }
	        }

	        return arr;
	}
	public static void main(String[] args) {
		int [][]A = {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		int [][]result = diagonal(A);
		for(int []p: result) {
			System.out.println(Arrays.toString(p));
		}
	}
}
