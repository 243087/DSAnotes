package com.rahul.kumar.Module4Day18Array2DMatrix;

import java.util.Arrays;

public class Program5FindTheTransposeOfMatrix_SquareMatrix {

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

        for(int []i: newArr) {
        	System.out.println(Arrays.toString(i)+" ");
        }		  
	}
}

