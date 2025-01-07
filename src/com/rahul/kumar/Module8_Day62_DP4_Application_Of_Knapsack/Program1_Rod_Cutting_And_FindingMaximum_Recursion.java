package com.rahul.kumar.Module8_Day62_DP4_Application_Of_Knapsack;

// Given a rod of length N and an array of length N. arr[ i ] → price of i-length rod.
// Find the max value that can be obtained by cutting the rod into 1 or more pieces and selling them.
public class Program1_Rod_Cutting_And_FindingMaximum_Recursion {

	static int rodCutting(int []arr, int N) {
		
		if(N==0)
			return 0;
		
		int maxValue = 0;
		for(int i=1;i<=N;i++) {
			maxValue = Math.max(maxValue,(arr[i-1]+rodCutting(arr,N-i)));
		}
		return maxValue;                                                   //     TC = O[N^N]        SC = O[N]
	}
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,6}; 
        int rodLength = 5;
        System.out.println("Maximum Value "+rodCutting(arr,rodLength));
	}
}
