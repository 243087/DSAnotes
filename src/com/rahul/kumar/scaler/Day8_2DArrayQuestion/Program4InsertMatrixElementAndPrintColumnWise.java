package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

import java.util.Scanner;

public class Program4InsertMatrixElementAndPrintColumnWise {

	static void printWholeMatrixColumnWise(int [][]matrix,int row,int col) {
		System.out.println("Matrix is ");
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) {
				System.out.print(matrix[i][j]+" ");                               // 1 2 3         1 4 7
			}                                                                     // 4 5 6    ==>  2 5 8
			System.out.println();                                                 // 7 8 9         3 6 9
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
		
		printWholeMatrixColumnWise(matrix,rowSize,colSize);
	}
}
