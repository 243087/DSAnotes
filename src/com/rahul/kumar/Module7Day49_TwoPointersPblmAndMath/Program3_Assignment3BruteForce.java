package com.rahul.kumar.Module7Day49_TwoPointersPblmAndMath;

// Problem Description

//Given a string A. Find the rank of the string amongst its permutations sorted lexicographically. Assume that no characters are repeated.
//Note: The answer might not fit in an integer, so return your answer % 1000003
public class Program3_Assignment3BruteForce {

	static int findRank(String str) {
		int MOD = 1000003;
		int rank = 0;
		for(int i=0;i<str.length();i++) {
			int count = 0;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)>str.charAt(j))
					count++;
			}
			rank += ((count * factorial(str.length()-i-1))%MOD)%MOD;
		}
		return (rank+1)%MOD;                                            //          TC = O[N^2]       SC = O[1]
	}
	static int factorial(int num) {
		if(num<=1)
			return 1;
		else
		    return num*factorial(num-1);
	}
	public static void main(String[] args) {
		String str = "wmaXtj";
		System.out.println(findRank(str));
	}
}
