package com.rahul.kumar.scaler.Module4Day18Array2DMatrix;

public class Program4ReturnMatrixAllTheAntiDigonalFromRightToLeft {
 
	public static int[][] returnMatrix(int[][] A) {
		 int n = A.length;
		 int m = A[0].length;
	        int[][] arr = new int[2 * n - 1][n];

	        for (int i = 0; i < 2 * n - 1; i++) {
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = 0;
	            }
	        }
	        for (int j = 0; j < n; j++) {
	            int row = 0;
	            int col = j;
	            int index = j;
	            while (row < n && col >= 0) {
	                arr[index][row] = A[row][col];
	                row++;
	                col--;
	            }
	        }	 
	        for (int i = 1; i < n; i++) {
	            int row = i;
	            int col = n - 1;
	            int index = i + n - 1;
	            while (row < n && col >= 0) {
	                arr[index][row - i] = A[row][col];
	                row++;
	                col--;
	            }
	        }
	        return arr;
	}
	public static void main(String[] args) {            
		int [][]arr = {{1,2,3,4},                                
				       {5,6,7,8},                   
				       {9,10,11,12}                  
				       };                           
		int [][] changedMatrix = returnMatrix(arr);

		for(int i=0;i<changedMatrix.length;i++) {
			for(int j=0;j<changedMatrix[i].length;j++) {
				System.out.print(changedMatrix[i][j]+" ");              //  1 0 0 0
			}                                                           //  2 5 0 0
			System.out.println();                                       //  3 6 9 0
		}                                                               //  4 7 10 0
                                                                        //  8 11 0 0
	}                                                                   //  12 0 0 0
}
