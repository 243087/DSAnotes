package com.rahul.kumar.scaler.Day8_2DArrayQuestion;

import java.util.Scanner;

public class Program4AddMatrixElementAndPrintColumnWise {

	static void printWholeMatrixColumnWise(int [][]matrix,int row,int col) {
		System.out.println("Matrix is ");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(matrix[j][i]+" ");                               // 1 2 3         1 4 7
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
