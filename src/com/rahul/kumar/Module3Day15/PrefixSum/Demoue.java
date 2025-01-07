package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Demoue {

	static void cntIndexesToMakeBalance(int []arr, int n) {
		int []oddPreSum = new int[arr.length];
		int []evnPreSum = new int[arr.length];
		
		oddPreSum[0] =0;
		evnPreSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			int val1 = 0;
			int val2 = 0;
			if(i%2==1)
				val1 = arr[i];
			else
				val2 = arr[i];
			
			oddPreSum[i] = oddPreSum[i-1] + val1;
			evnPreSum[i] = evnPreSum[i-1] + val2;
		}
		
		
		System.out.println("Odd Prefix sum array is : "+Arrays.toString(oddPreSum));
		System.out.println("Even Prefix sum array is : "+Arrays.toString(evnPreSum));
		int count = 0;
		int oddSum = 0;
		int evnSum = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				oddSum = evnPreSum[arr.length-1] - evnPreSum[i];
				evnSum = evnPreSum[arr.length-1] - evnPreSum[i];
			}
			else {
				oddSum = oddPreSum[i-1] + (evnPreSum[arr.length-1] - evnPreSum[i]);
				evnSum = evnPreSum[i-1] + (evnPreSum[arr.length-1] - evnPreSum[i]);
			}
			if(oddSum== evnSum)
				count++;
		}
		System.out.println(count);
}
	public static void main(String[] args) {
		int []arr = {4,3,2,7,6,-2};
		int n = arr.length;
		System.out.println("Given array is "+Arrays.toString(arr));
		cntIndexesToMakeBalance(arr,n);
		
	}
}
// Given array is [4, 3, 2, 7, 6, -2]
// Odd Prefix sum array is : [0, 3, 3, 10, 10, 8]
// Even Prefix sum array is : [4, 4, 6, 6, 12, 12]