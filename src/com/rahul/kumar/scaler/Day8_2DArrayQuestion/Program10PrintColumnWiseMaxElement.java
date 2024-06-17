package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program10PrintColumnWiseMaxElement {

	static void printMaxColumnWise(int [][]matrix) {
		int row =matrix.length;
		int col = matrix[0].length;
		
		for(int i=0;i<col;i++) {
			int maz = matrix[0][0];
			for(int j=0;j<row;j++) {
				if(matrix[j][i]>maz)
					maz = matrix[j][i];
			}
			System.out.println(maz);
		}
	}
	public static void main(String[] args) {
		int [][]matrix =  {{1,2,4,5},
		                  {14,12,43,44},
		                  {65,20,87,3},
		                  {23,3,0,9}};
		
		printMaxColumnWise(matrix);
	}
}
