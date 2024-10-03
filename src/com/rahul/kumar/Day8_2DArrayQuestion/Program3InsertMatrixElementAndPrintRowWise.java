package com.rahul.kumar.Day8_2DArrayQuestion;

import java.util.Scanner;

public class Program3InsertMatrixElementAndPrintRowWise {

	static void printWholeMatrixRowWise(int [][]matrix,int row,int col) {

		System.out.println("Matrix is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");                                 // 1 2 3         1 2 3
			}                                                                       // 4 5 6  ===>   4 5 6
			System.out.println();                                                   // 7 8 9         7 8 9
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rowSize");
		int rowSize = sc.nextInt();
		System.out.println("Enter the colSize");
		int colSize = sc.nextInt();
		
		int [][] matrix = new int [rowSize][colSize];
		System.out.println("Enter the elements of array");
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		printWholeMatrixRowWise(matrix,rowSize,colSize);
	}
}
