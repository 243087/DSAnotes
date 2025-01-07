package com.rahul.kumar.Module8_Day62_DP4_Application_Of_Knapsack;

import java.util.Arrays;

public class Program2_CoinChange1_Memoization {

	static int waysToPay(int []coins, int amount) {
		int dp[] = new int[amount+1];
		Arrays.fill(dp,-1);
		return coinHelper(coins, dp, amount);
	}
	static int coinHelper(int []coins, int []dp, int amount) {
		if(amount==0)
			return 1;
		if(dp[amount]!=-1)
			return dp[amount];
		                                                      //        TC = O[No of coins(N) * A(amount)]         SC = O[A]
		int no = 0;
		
		for(int i=0;i<coins.length;i++) {
			if(amount-coins[i]>=0)
				no += coinHelper(coins,dp,amount-coins[i]);
		}
		return no;
	}
	public static void main(String[] args) {
		int []coins = {3,1,4};
		int amount = 5;
		System.out.println("Total ways to pay "+waysToPay(coins,amount));
	}
}
