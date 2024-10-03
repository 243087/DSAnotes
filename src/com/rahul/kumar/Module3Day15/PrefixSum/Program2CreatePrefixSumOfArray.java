package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program2CreatePrefixSumOfArray {
	static int [] prefixSum(int [] arr){
		int [] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {   // this for loop is basically for the adding sum value into newly created array newArr 
			int sum =0;
			for(int j=0;j<=i;j++) {
				sum += arr[j];
			}
			newArr[i] = sum;
		}
		return newArr;                                     // time Complexity = O[N^2]    || Space complexity = O[N]
	}
 public static void main(String[] args) {
	int [] arr = {2,8,7,0,10,11};
	 System.out.println("Given array is "+Arrays.toString(arr));
	System.out.println("Prefix sum of given array is "+Arrays.toString(prefixSum(arr)));
}  
}
