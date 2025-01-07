package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

//< Question > : Given an integer sorted array A and an integer K. Find any pair[i,j] such that A[i] + A[j] = K, i!=j
public class Program5_QuestionByUsingTwoPointers {

	static boolean checkPairs(int []arr,int find) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int total = arr[l] + arr[r];
			if(total==find)
				return true;
			else if(total>find)
				r--;
			else
				l++;
		}
		return false;                                               //         TC = O[N]      SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {-3,0,1,3,6,8,11,14,18,25};
		int find = 12;
		System.out.println(checkPairs(arr,find));
	}
}
