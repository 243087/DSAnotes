package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Program3PrintDigonalAndAntiDigonalOfSquareMatrix {

	static void printDiagonal(int [][]arr) {
	/*	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i][i]+" ");
		}*/
		
		int row = 0;
		int col =0;
		while(row<arr.length && col<arr.length) {
			System.out.print(arr[row][col]+" ");                // For printing the Diagonal
			row++;
			col++;
		}
		System.out.println();
	}
	
	static void printAntiDigonal(int [][]arr) {
		int row = 0;
		int col =arr.length-1;
		while(row<arr.length && col>=0) {
			System.out.print(arr[row][col]+" ");               // For printing the AntiDiagonal
			row++;
			col--;
		}
	}
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printDiagonal(arr);
		printAntiDigonal(arr);
                	
	}
}
