package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.HashSet;

//< Question > : Given an integer sorted array A and an integer K. Find any pair[i,j] such that A[i] + A[j] = K, i!=j
public class Program5_QuestionByUsingHashSet {

	static boolean checkPair(int []arr,int find) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
			int need = find - a;
			if(hs.contains(need))
				return true;
			hs.add(a);
		}
		return false;                                            //        TC = O[N]        SC = O[N]
	}
	public static void main(String[] args) {
		   int []arr = {-5,-2,1,8,10,12,15};
		   int sum = 11;
		   System.out.println(checkPair(arr,sum));
		}
}
