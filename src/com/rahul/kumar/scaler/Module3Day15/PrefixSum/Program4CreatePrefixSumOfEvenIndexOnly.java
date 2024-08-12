package com.rahul.kumar.scaler.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program4CreatePrefixSumOfEvenIndexOnly {
	static int []prefixSumOfEven(int []arr){
		int [] newArr = new int[arr.length];
		newArr[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			int val =0;
			if(i%2==0) {
				val = arr[i];
			}
			newArr[i] = newArr[i-1] +val;
		}
		return newArr;
	}

	public static void main(String[] args) {
		int []arr = {2,3,1,6,4,5};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 System.out.println("Prefix sum of given array is "+Arrays.toString(prefixSumOfEven(arr)));
	}
}
