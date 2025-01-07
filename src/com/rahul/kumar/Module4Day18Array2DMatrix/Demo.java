package com.rahul.kumar.Module4Day18Array2DMatrix;

import java.util.Arrays;

public class Demo {
	   public static int[][] matrixRotate(int[][] A) {
	        int [][] newArr = new int[A[0].length][A.length];
	         for(int i=0;i<A.length;i++){
	             for(int j=0;j<A[i].length;j++){
	                 newArr[j][i] =A[i][j];
	             }
	         }
	         return newArr;
	    }
	public static void main(String[] args) {
		int [][]arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int [][]result  = matrixRotate(arr); 
		for(int []p: result) {
			System.out.println(Arrays.toString(p));
		}
	}
}
