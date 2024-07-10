package com.rahul.kumar.scaler.Module4Day18Array2DMatrix;

import java.util.Arrays;

public class Program1Given2DMatrixPrintTheRowWiseSum {

	static void printSum2DMatrixRowWise(int [][]arr) {
		
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=0;j<arr[i].length;j++) {
				sum +=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

		
		printSum2DMatrixRowWise(arr);
				 
	                 	
	}
}
