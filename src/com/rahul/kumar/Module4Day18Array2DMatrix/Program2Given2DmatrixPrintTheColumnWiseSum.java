package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Program2Given2DmatrixPrintTheColumnWiseSum {

	static void printSum2DMatrixColumnWise(int [][]arr) {
		for(int j=0;j<arr[j].length;j++) {
			int sum =0;
			for(int i=0;i<arr.length;i++) {
				sum +=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

		
		printSum2DMatrixColumnWise(arr);
                	
	}
}
