package com.rahul.kumar.Module3Day16.CarryForwardAndSubArrayOfString;

import java.util.Arrays;

public class Program2ReturnTheSubArrayOfTheArrayAllPossibleSubArray {

	static int[][] printSubArray(int []arr) {
		int n = arr.length;
		int newArrLength = (n*(n+1))/2;
		int [][] newArr = new int[newArrLength][];
		
		int index =0;
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				int[] subArray = new int[e - s + 1];
				int innerIndex = 0;
				for(int i=s;i<=e;i++) {
					subArray[innerIndex++] = arr[i];
				} 
				newArr[index++] = subArray;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		int []arr = {5,2,1,6};
		int [][] result = printSubArray(arr);
		for(int []r : result)
			 System.out.println(Arrays.toString(r));
	}
}
