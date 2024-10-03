package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Program4PrintAllTheAntiDigonalFromLeftToRightInMatrix {

	static void printAllDiagonal(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			int row =i;
			int col = 0;
			while(row>=0 && col<arr[0].length) {
				System.out.print(arr[row][col]+" ");
				row--;
				col++;
			}
			System.out.println();
		}
		for(int j=1;j<arr[0].length;j++) {
			int row =arr.length-1;
			int col =j;
			while(row>=0 && col<arr[0].length) {
				System.out.print(arr[row][col]+" ");
				row--;
				col++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {               //      output
		int [][]arr = {{1,2,3,4},
				       {5,6,7,8},                     //   ==>     1
				       {9,10,11,12}                   //           5 2
				       };                             //           9 6 3 
		printAllDiagonal(arr);                        //          10 7 4
                                                      //          11 8
	}                                                 //          12
}
