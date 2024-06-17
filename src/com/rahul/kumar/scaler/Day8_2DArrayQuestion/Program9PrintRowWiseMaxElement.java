package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program9PrintRowWiseMaxElement {

	static void printMaxRowWise(int [][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		for(int i=0;i<row;i++) {
			int maxRow = matrix[i][0];
			for(int j=0;j<col;j++) {
				if(matrix[i][j]>maxRow)
					maxRow = matrix[i][j];
			}
			System.out.println(maxRow);
		}
	}
	public static void main(String[] args) {
		int [][]matrix =  {{1,2,4,5},
		                  {14,12,43,44},
		                  {65,20,87,3},
		                  {23,3,0,9}};
		
		printMaxRowWise(matrix);
	}
}
