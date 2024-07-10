package com.rahul.kumar.scaler.Module4Day18Array2DMatrix;

public class Program5FindTheTransposeOfMatrix {

	static void matrixTranspose(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				swap(arr,i,j);
			}
		}
		
		// for printing the matrix
		  for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }                                                      // Time Complexity O[N^2]
	}
	static void swap(int [][]arr,int row,int col) {
		int temp = arr[row][col];
		arr[row][col] = arr[col][row];
		arr[col][row] = temp;
	}
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixTranspose(arr); 
	}
}
