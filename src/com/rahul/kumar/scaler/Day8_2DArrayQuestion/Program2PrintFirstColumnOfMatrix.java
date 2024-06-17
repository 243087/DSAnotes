package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program2PrintFirstColumnOfMatrix {

	static void printSecondRow(int [][]matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		System.out.println("1st coulumn of matrix is ");
		for(int i=0;i<row;i++) {
			System.out.print(matrix[i][0]+" ");
		}
	}
	public static void main(String[] args) {
		int [][]matrix = {{1,2,3,4,5},
		          {6,7,8,9,10},
		          {11,12,13,14,15},
		          {16,17,18,19,20}};

       printSecondRow(matrix);
	}
}
