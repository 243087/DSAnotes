package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

public class Program6WaveFormRowRise {

	static void printWave(int [][]matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0;i<row;i++) {
			if(i%2==0) {
				for(int j=0;j<col;j++) 
					System.out.print(matrix[i][j]+" ");
			}
			else {
				for(int k=col-1;k>=0;k--) 
					System.out.print(matrix[i][k]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][]matrix =  {{4,1,2},
		                  {7,10,11},
		                  {3,7,7},
		                  };
		
		printWave(matrix);
	}
}
