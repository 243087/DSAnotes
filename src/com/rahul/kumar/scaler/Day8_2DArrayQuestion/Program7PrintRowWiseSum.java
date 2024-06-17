package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program7PrintRowWiseSum {

	static void printRowWiseSum(int [][]matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		for(int i=0;i<row;i++) {
			int sum = 0;
			for(int j=0;j<col;j++) {
				sum += matrix[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		int [][]matrix =  {{1,2,4,5},
		                  {14,12,43,44},
		                  {65,20,87,3},
		                  {23,3,0,9}};
		
		printRowWiseSum(matrix);
	}
}
