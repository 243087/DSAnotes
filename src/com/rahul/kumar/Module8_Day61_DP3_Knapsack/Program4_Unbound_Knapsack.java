package com.rahul.kumar.Module8_Day61_DP3_Knapsack;

import java.util.Arrays;

public class Program4_Unbound_Knapsack {

	static int maxHappiness(int []hapiness,int []weight, int capacity) {
		int n = hapiness.length;
		
		int [][]dp = new int[n][capacity+1];
		for(int i=0;i<n;i++) {                                         //         TC = O[N*capacity]          SC = O[N*capacity]
			Arrays.fill(dp[i],-1);
		}
		return knapsackHelper(hapiness,weight,dp,n-1,capacity);
	}
	static int knapsackHelper(int []hapiness,int []weight,int [][]dp,int i,int cap) {
		if(i<0)
			return 0;
		if(dp[i][cap]!=-1)
			return dp[i][cap];
		
		int dont = knapsackHelper(hapiness,weight,dp,i-1,cap);
		int take = 0;
		if(cap - weight[i]>=0) {
			take = hapiness[i] + knapsackHelper(hapiness,weight,dp,i,cap-weight[i]);
		}
		dp[i][cap] = Math.max(dont,take);
		return dp[i][cap];
	}
	 public static void main(String[] args) {
	        int[] happiness = {2,3,5};
	        int[] weight = {3,4,7};
	        int capacity = 8;

	        System.out.println("Maximum Happiness: " + maxHappiness(happiness, weight, capacity));
	    }
}
