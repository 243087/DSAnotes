package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

import java.util.Arrays;

public class Program2_MatrixDirection_Memoization {

	static  public int uniquePathsWithObstacles(int[][] A) {
	        int[][] dp = new int[A.length][A[0].length];

	        for (int i = 0; i < A.length; i++) {
	            Arrays.fill(dp[i], -1);
	        }

	        
	        return ways(dp,A,A.length-1,A[0].length-1);
	    }
	 static   public int ways(int [][]dp,int[][] A,int r, int c){
	         if (r < 0 || c < 0 || A[r][c] == 1) {
	            return 0;
	        }
	        if (r == 0 && c == 0) {
	            return 1;
	        }
	        if (dp[r][c] != -1) {
	            return dp[r][c];
	        }

	        dp[r][c] = ways(dp, A, r - 1, c) + ways(dp, A, r, c - 1);
	        return dp[r][c];   
	    }
	 public static void main(String[] args) {
       int [][]arr = {{0,0,0},{0,0,0},{0,0,0}};
       System.out.println(uniquePathsWithObstacles(arr));
	    }
}
