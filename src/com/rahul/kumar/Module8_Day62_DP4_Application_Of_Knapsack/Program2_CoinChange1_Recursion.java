package com.rahul.kumar.Module8_Day62_DP4_Application_Of_Knapsack;

// <Question> : N different denominations.Total number of ways to pay a given amount.
//     Note :   • Any denomination any number of times. ( x , y ) ≠ ( y , x ) --> This is called ordered selection
public class Program2_CoinChange1_Recursion {

	static int waysToPay(int []coins,int amount) {
		if(amount==0)
			return 1;
		int no = 0;
		for(int i=0;i<coins.length;i++) {
			if(amount-coins[i]>=0) {
				no += waysToPay(coins,amount-coins[i]);
			}
		}
		return no;
	}
	public static void main(String[] args) {
		int []coins = {3,1,4};
		int amount = 5;
		System.out.println("Total ways to pay "+waysToPay(coins,amount));
	}
}
