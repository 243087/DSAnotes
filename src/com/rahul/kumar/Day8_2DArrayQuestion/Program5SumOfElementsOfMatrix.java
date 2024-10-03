package com.rahul.kumar.Day8_2DArrayQuestion;

public class Program5SumOfElementsOfMatrix {

static int printSumMatrix(int [][]matrix){
	int sum =0;
	int row = matrix.length;
	int col = matrix[0].length;
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			sum+= matrix[i][j];
		}
	}
	return sum;
}
	public static void main(String[] args) {
		int [][]matrix = {{1,2,4,5},
				          {14,12,43,44},
				          {65,20,87,3},
				          {23,3,0,9}};
		System.out.print("Sum Of Matrix is : "+printSumMatrix(matrix));
		}
	}
