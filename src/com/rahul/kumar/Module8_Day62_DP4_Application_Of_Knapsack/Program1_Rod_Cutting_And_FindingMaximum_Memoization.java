package com.rahul.kumar.Module8_Day62_DP4_Application_Of_Knapsack;

import java.util.Arrays;

public class Program1_Rod_Cutting_And_FindingMaximum_Memoization {

    static int rodCutting(int []arr, int N) {
		
    	int []dp = new int[N+1];
    	Arrays.fill(dp,-1);
    	
    	return rodHelper(arr,dp,N);
    }
    	
    static int rodHelper(int []arr,int []dp,int N) {
		if(N==0)
			return 0;
		if(dp[N]!=-1)
			  return dp[N];
		
		int maxValue = 0;
		for(int i=1;i<=N;i++) {
			maxValue = Math.max(maxValue,(arr[i-1]+rodCutting(arr,N-i)));
		}
		return dp[N];                                                   //     TC = O[N*N]        SC = O[N]
	}
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,6}; 
        int rodLength = 5;
        System.out.println("Maximum Value "+rodCutting(arr,rodLength));
	}
}
