package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;

// Every element occurs twice except for 1. Find that unique element.
public class Program4_InArrayEveryElementOccursTwiceExceptOneFindThatElementByLinear {

	static int findElement(int []arr) {
		int unique =0;
		for(int i=0;i<arr.length;i++) {
			unique = unique ^arr[i];
		}
		return unique;                             //           TC = O[N]        SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {8,8,5,5,9,9,6,2,2,4,4};
		System.out.println(findElement(arr));
		
	}
}
