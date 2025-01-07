package com.rahul.kumar.Module8_Day62_DP4_Application_Of_Knapsack;

import java.util.Arrays;

public class Program3_CoinChange2_Memoization {

	static int waysToPay(int []coins,int amount) {
		int n = coins.length;
		int [][]dp = new int[n+1][amount+1];
		for(int []row: dp) {
		  Arrays.fill(row,-1);
		}
		return coinHelper(coins,dp, amount,n);
	}                                                                    //     TC = O[n*amount]        SC = O[n*amount]
	static int coinHelper(int []coins,int[][]dp,int amount,int n) {
		if(amount==0)
			return 1;
		if(n==0)
			return 0;
		
		if(dp[n][amount]!=-1)
			return dp[n][amount];
		
		int dont = coinHelper(coins,dp,amount,n-1);
		int take = 0;
		
		if(amount>=coins[n-1])
			take = coinHelper(coins,dp,amount-coins[n-1],n);
		
		dp[n][amount] = take+dont;
		return dp[n][amount];
	}
	public static void main(String[] args) {
		int []coins = {3,1,4};
		int amount = 5;
		System.out.println("Total ways to pay "+waysToPay(coins,amount));
	}
}
