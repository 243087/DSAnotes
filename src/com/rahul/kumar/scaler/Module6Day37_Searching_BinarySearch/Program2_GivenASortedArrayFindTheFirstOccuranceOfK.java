package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;

public class Program2_GivenASortedArrayFindTheFirstOccuranceOfK {

	static int firstOccurance(int []arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;                                             //               TC = O[N]         SC = O[1]
	}
	public static void main(String[] args) {
		int []arr =  {-5,-5,-3,0,0,1,5,5,5,5,5,8,10,10,15};
		int num = 5;
		System.out.println(firstOccurance(arr,num));
	}
}
