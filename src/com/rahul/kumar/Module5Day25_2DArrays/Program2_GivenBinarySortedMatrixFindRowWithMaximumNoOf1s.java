package com.rahul.kumar.Module5Day25_2DArrays;

//  Given a binary sorted matrix A[N][N]. Find the row with max number of 1's
//  NOTE: If two rows have the max no of 1,return lower index
//      : Assume each now to be sorted by values


//     This is bruteForce approach
public class Program2_GivenBinarySortedMatrixFindRowWithMaximumNoOf1s {

	static void maxOne(int [][]arr) {
		int ans =-1;
		int maxRowCount = -Integer.MAX_VALUE;
		for(int r=0;r<arr.length;r++) {
			int rowSum =0;
			for(int c=0;c<arr[r].length;c++) {
				rowSum += arr[r][c];
			}
			if(rowSum>maxRowCount) {
				maxRowCount = rowSum;
				ans = r;                               //                   TC = O[R*C]        SC =O[1]
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int [][]arr = {{0,0,0,0},
				       {0,0,0,1},
				       {0,1,1,1},
				       {0,1,1,1}};
		maxOne(arr);
	}
}
