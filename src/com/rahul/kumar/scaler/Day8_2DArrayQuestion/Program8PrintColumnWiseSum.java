package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program8PrintColumnWiseSum {

	static void printRowWiseSum(int [][]matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0;i<col;i++) {
			int sum =0;
			for(int j=0;j<row;j++) {
				sum +=matrix[j][i];
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
