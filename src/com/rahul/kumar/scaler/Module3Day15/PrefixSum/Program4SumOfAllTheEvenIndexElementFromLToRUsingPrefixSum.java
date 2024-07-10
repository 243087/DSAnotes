package com.rahul.kumar.scaler.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program4SumOfAllTheEvenIndexElementFromLToRUsingPrefixSum {

	static void sumOfEvenIndexElement(int []arr, int [][]indexedArray) {
		int [] prefArr = new int[arr.length];
		prefArr[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			int val =0;
			  if(i%2==0) {
				  val = arr[i];
			  }
			  prefArr[i] = prefArr[i-1]+val;
		}
		System.out.println("Prefix sum array of evenIndex : "+Arrays.toString(prefArr));
		
		for(int j=0;j<indexedArray.length;j++) {
			int l=indexedArray[j][0];
			int r=indexedArray[j][1];
			int sum =0;
			if(l==0) {
				sum += prefArr[r];
			}
			else {
				sum += prefArr[r] -prefArr[l-1];
			}
			System.out.print(sum+" ");
		}
		
		
	}
	public static void main(String[] args) {
		 int []arr = {2,3,1,6,4,5};
		 int [][] indexedArray = {{1,3},{2,5},{0,4},{3,3}};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 sumOfEvenIndexElement(arr,indexedArray);
	}
}
