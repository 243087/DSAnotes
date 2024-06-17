package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program1PrintFirstRowOfMatrix {


	static void printFirstRow(int [][]matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		System.out.println("First Row of matrix");
		for(int i=0;i<col;i++) {			
		System.out.print(matrix[0][i]+" ");	
		}
	}
	public static void main(String[] args) {
		
		int [][]matrix = {{1,2,3,4,5},
				          {6,7,8,9,10},
				          {11,12,13,14,15},
				          {16,17,18,19,20}};
		
		printFirstRow(matrix);
	}
}
