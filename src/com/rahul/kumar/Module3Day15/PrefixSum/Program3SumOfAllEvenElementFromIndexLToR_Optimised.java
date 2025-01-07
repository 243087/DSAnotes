package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program3SumOfAllEvenElementFromIndexLToR_Optimised {

	static void sumOfEvenElements(int []arr, int [][]index) {
		// create prefixSum with given array itself
		int [] preSum = new int [arr.length];
		preSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			int val =0;
			if(i%2==0) {
				val = arr[i];
			}
			preSum[i] = preSum[i-1] + val;
		}                                                         //          TC = O[N+M]
		
		System.out.println("preFix Sum array is : "+Arrays.toString(preSum));
		
		for(int i=0;i<index.length;i++) {
			int l = index[i][0];
			int r = index[i][1];
			int sum =0;
			
			if(l==0)
				sum = preSum[r];
			else
				sum = preSum[r] - preSum[l-1];
			
			System.out.print(sum+" ");                           
		}
	}
	public static void main(String[] args) {
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 int [][] indexedArray = {{4,8},{3,7},{1,3},{0,4},{7,7}};
	     sumOfEvenElements(arr,indexedArray);
	}
}
//-3 6 2 4 5 2 8 -9 3 1
// 0 1 2 3 4 5 6  7 8 9