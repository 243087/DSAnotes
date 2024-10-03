package com.rahul.kumar.scaler.Module5Day25_2DArrays;

public class Program5_SumOfAllPossibleSubmatrixUsingContributionTechnique {

	static void sumMatrix(int [][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		long ans =0;
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				long TL = (r+1)*(c+1);
				long BR = (row-r)*(col-c);
				ans += arr[r][c]*TL*BR;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int [][]arr = {{4,9,6},
			       {5,-1,2}
	              };
	sumMatrix(arr);
	}
}
