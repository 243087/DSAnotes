package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

// < Question > : Find count of all the pairs in a sorted array whose sum is K. ( i != j )
public class Program6_QuestionByUsingBruteForce {

	static int countPairs(int []arr,int find) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==find)
					count++;
			}
		}
		return count;                                             //           TC = O[N^2]
	}
	public static void main(String[] args) {
		int []arr = {1,3,4,4,5,6,6,6,7,10};
		int find = 10;
		System.out.println(countPairs(arr,find));
	}
}
