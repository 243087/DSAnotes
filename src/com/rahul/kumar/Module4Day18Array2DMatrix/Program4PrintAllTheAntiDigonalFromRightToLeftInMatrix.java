package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Program4PrintAllTheAntiDigonalFromRightToLeftInMatrix {

	static void printAllDiagonal(int [][]arr) {
		for(int j=0;j<arr[0].length;j++) {
			int row =0;
			int col =j;
			while(row<arr.length && col>=0) {
				System.out.print(arr[row][col]+" ");
				row++;
				col--;
			}
			System.out.println();
		}
		for(int i=1;i<arr.length;i++) {
			int row =i;
			int col = arr[0].length-1;
			while(row<arr.length && col>=0) {
				System.out.print(arr[row][col]+" ");             //   Time Complexity = O[N*M]
				row++;
				col--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {               //      output
		int [][]arr = {{1,2,3,4},
				       {5,6,7,8},                     //   ==>     1
				       {9,10,11,12}                   //           2 5
				       };                             //           3 6 9 
		printAllDiagonal(arr);                        //           4 7 10
                                                      //           8 11
	}                                                 //           12
}
