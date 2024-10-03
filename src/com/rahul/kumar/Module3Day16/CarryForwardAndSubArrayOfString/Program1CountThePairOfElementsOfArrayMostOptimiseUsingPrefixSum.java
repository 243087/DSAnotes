package com.rahul.kumar.Module3Day16.CarryForwardAndSubArrayOfString;

import java.util.Arrays;

public class Program1CountThePairOfElementsOfArrayMostOptimiseUsingPrefixSum {

	static void countPairString(String str) {
		int []arr = new int[str.length()];
		int []preSumArr = new int[arr.length];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='g')
				arr[i]=1;
			else
				arr[i]=0;
		}
		System.out.println("New array is : "+Arrays.toString(arr));
		//Now create the preSum Array
		preSumArr[0]=arr[0];
		for(int j=1;j<arr.length;j++) {
			preSumArr[j] = preSumArr[j-1]+arr[j];
		}
		System.out.println("Prefix Sum array is : "+Arrays.toString(preSumArr));
		
		
		int count =0;
		for(int k=0;k<str.length()-1;k++) {
           if(str.charAt(k)=='a') {
        	   count += preSumArr[str.length()-1] - preSumArr[k];
           }
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str ="acgdgag";
		countPairString(str);
	}
}
