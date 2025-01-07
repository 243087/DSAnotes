package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

//< Question > : Find count of all the pairs in a sorted array whose sum is K. ( i != j )
public class Program6_QuestionByUsingTwoPointersForUniqueElementOnly {

	static int countPairs(int []arr,int find) {
		int l = 0;
		int r = arr.length-1;
		int count =0;
		
		while(l<r) {
			int total = arr[l] + arr[r];
			if(total==find) {
				count++;
				l++;
				r--;
			}
			else if(total>find)
				r--;
			else
				l++;
		}
		return count;                                               //          TC = O[N]       SC = O[1]
	}
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6, 7, 10 };
		int find = 10;
		System.out.println(countPairs(arr, find));
	}
}
