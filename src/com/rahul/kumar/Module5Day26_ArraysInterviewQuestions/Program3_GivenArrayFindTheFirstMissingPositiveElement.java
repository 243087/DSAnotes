package com.rahul.kumar.Module5Day26_ArraysInterviewQuestions;

// <Question> : Given an Integer array A[], find the first missing positive integer.	
public class Program3_GivenArrayFindTheFirstMissingPositiveElement {

	static int missingElement(int []arr) {
		for(int i=1;i<=arr.length;i++) {
			boolean check = false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					check = true;
					break;
				}
			}
			if(!check)
				return i;
		}
		 return arr.length+1;                            //                        TC = O[N^2]           SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7};
		System.out.println(missingElement(arr));
	}
}
