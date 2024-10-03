package com.rahul.kumar.scaler.Module7Day47_MathCombinatoricsBasics;

import java.util.ArrayList;

public class Program1_GenerateThePascalsTriangleForGivenNOptimised {

	static int [][] generateTriangle(int n){
		
       int [][] arr= new int[n+1][n+1];
       
		for(int r=0;r<=n;r++) {
			for(int c=0;c<=r;c++) {
				if(c==0||c==r) {
					arr[r][c] = 1;
				}
				else {
					arr[r][c] = arr[r-1][c]+arr[r-1][c-1];
				}                  
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int n = 4;
		int[][] result = generateTriangle(n);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
