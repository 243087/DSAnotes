package com.rahul.kumar.scaler.Module5Day26_ArraysInterviewQuestions;

import java.util.HashSet;

public class Program3_GivenArrayFindTheFirstMissingPositiveElementOptimiseWay {

	static int missingElement(int []arr) {
		HashSet<Integer> hs = new HashSet<>();
	   for(int i=0;i<arr.length;i++) {
		   int value = arr[i];
		   hs.add(value);
	   }
	   System.out.println(hs);

	   for(int i=1;i<=arr.length+1;i++) {
		   if(!hs.contains(i))
			   return i;                                 //             TC = O[N]               SC = O[N]
	   }
	return -1;
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,5,7};
		System.out.println(missingElement(arr));
	}
}
