package com.rahul.kumar.Module8_Day61_DP3_Knapsack;

import java.util.Arrays;

//<Question> : Subset Sum = K
// You are given a set of non-negative integers and a target sum. The task is to determine whether there exists a subset of the 
// given set whose sum is equal to the target sum.


public class Program1_Is_SubSetSum_equals_K {

	static boolean subSetSum(int []set,int sum) {
		Boolean[][] dp = new Boolean[set.length][sum + 1];
		
		return setHelper(set,dp,set.length-1,sum);
	}
	static boolean setHelper(int []set,Boolean [][]dp,int i,int k) {
		if(i<0) {
			if(k==0)
				return true;
			else
				return false;
		}
		if(dp[i][k] != null)
			return dp[i][k];
		                                                     //          TC = O[N*K]        SC = O[N*K]
		boolean dont = setHelper(set,dp,i-1,k);
		boolean take = false;
		if(k>=set[i]) {
			take = setHelper(set,dp,i-1,k-set[i]);
		}
		dp[i][k] = take || dont;
		return take || dont;
			
	}
	public static void main(String[] args) {
		int []set = {3,34,4,12,5,2};
		int sum = 9;
		System.out.println("Subset is there "+subSetSum(set,sum));
	}
}
