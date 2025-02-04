package com.rahul.kumar.Module8_Day68_TopologicalSort_InterviewQuestion;

//<Question>: Given an array A where the i-th element represents the price of a stock on day i,the objective is to find the 
//            maximum profit. We're allowed to complete as many transactions as desired, but engaging in multiple transactions 
//            simultaneously is not allowed.
public class Program3_MaximumProfitFromStockPrices {

	static int maxProfit(int []arr) {
		int ans = 0;
		for(int i=1;i<arr.length;i++) {
			int profit = arr[i]-arr[i-1];
			if(profit>0)                                      //                TC = O[N]         SC = O[1]
				ans += profit;
		}
		return ans;
	}
	public static void main(String[] args) {
		int []arr = {2,3,1,2,0,5,1};
		System.out.println(maxProfit(arr));
	}
}
