package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

//< Question > : Given an integer sorted array A and an integer K. Find any pair[i,j] such that A[i] + A[j] = K, i!=j
public class Program5_QuestionByUsingBinarySearch {

	static boolean checkPair(int []arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
			int b = sum - a;
			
			// implement the boinary search here
			if(binarySearch(arr,b,i+1,arr.length-1))
				return true;
		}
		return false;                                         //                TC = O[NlogN]
	}
	static boolean binarySearch(int []arr,int find, int s, int e) {
		while(s<=e) {
			int mid = s +(e-s)/2;
			if(arr[mid]==find)
				return true;
			if(arr[mid]>find)
				e = mid-1;
			else
				s = mid+1;
		}
		return false;
	}
	public static void main(String[] args) {
		 int []arr = {-5,-2,1,8,10,12,15};
		 int sum = 11;
		 System.out.println(checkPair(arr,sum));
	}
}
