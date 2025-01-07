package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

// < Question > : Given an integer sorted array A and an integer K. Find any pair[i,j] such that A[i] + A[j] = K, i!=j
public class Program5_QuestionByUsingBruteForce {

	static boolean checkPair(int []arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum)
					 return true;
			}
		}
		return false;                                      //             TC = O[N^2]
	}
	public static void main(String[] args) {
	   int []arr = {-5,-2,1,8,10,12,15};
	   int sum = 11;
	   System.out.println(checkPair(arr,sum));
	}
}
