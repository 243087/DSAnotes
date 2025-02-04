package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

public class Program1_ReturnTheSmallestNumberInTheFormOfArray3_CountSort {

	static int [] sortTheArray(int []arr){
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minValue)
				minValue = arr[i];
			if(arr[i]>maxValue)
				maxValue = arr[i];
		}
		 // Calculate the range and create a frequency array based on the range
		int range = maxValue - minValue +1;
		int [] freqArr = new int[range];
		
		  // Count the frequencies using the offset concept
		for(int i=0;i<arr.length;i++) {
			int index = arr[i] - minValue;
			freqArr[index]++;
		}
		int k =0;
		for(int i=0;i<freqArr.length;i++) {
			int freq = freqArr[i];
			for(int j=1;j<=freq;j++) {
				arr[k] = i+minValue;
				k++;
			}
		}
		return arr;                                  //                  TC = O[N] 
	}
	public static void main(String[] args) {
		int []arr = {-2,3,8,3,-2,32,77};
		System.out.println(Arrays.toString(sortTheArray(arr)));
	}
}
