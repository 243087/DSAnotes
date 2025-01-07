package com.rahul.kumar.Module4Day20SortingBasic;

import java.util.Arrays;

public class Program3_CountTheNobleIntegerForRepeatedElementAlso {

	static void countNoble(int []arr) {
		Arrays.sort(arr);
		System.out.println("Sorted array is "+Arrays.toString(arr));
		int nobleCount =0;
		int smaller =-1;
		int preVal = -Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int currVal = arr[i];
			if(preVal!=currVal)
				smaller = i;
			if(currVal==smaller)
				nobleCount++;
			
			preVal = currVal;
			
		}
		System.out.println(nobleCount);
	}
	public static void main(String[] args) {
		int []arr = {-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
		System.out.println("Given Array is "+Arrays.toString(arr));
		countNoble(arr);
	}
}
