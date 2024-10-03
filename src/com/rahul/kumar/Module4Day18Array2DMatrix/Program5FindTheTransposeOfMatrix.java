package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Program5FindTheTransposeOfMatrix {

	static int [][] matrixTranspose(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				swap(arr,i,j);
			}
		}
		
             return arr;                                        // Time Complexity O[N^2]
	}
	static void swap(int [][]arr,int row,int col) {
		int temp = arr[row][col];
		arr[row][col] = arr[col][row];
		arr[col][row] = temp;
	}
	
	
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		int [][] newArr =matrixTranspose(arr); 
		// for printing the matrix
		  for (int i = 0; i < newArr.length; i++) {
	            for (int j = 0; j < newArr[i].length; j++) {
	                System.out.print(newArr[i][j] + " ");
	            }
	            System.out.println();
	        } 
	}
}

/*
 * class Solution { public int[][] transpose(int[][] matrix) { int[][] x = new
 * int[matrix[0].length][matrix.length]; for(int i=0; i < matrix.length; i++){
 * for(int j=0; j < matrix[0].length; j++){ x[j][i] = matrix[i][j]; } } return
 * x; } }
 */
