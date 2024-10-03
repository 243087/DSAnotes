package com.rahul.kumar.Module6Day42_Stack2;

import java.util.Arrays;

//Given an array of size N. For every index i, find the nearest element which is smaller than ith element on left side.
public class Program1_NearestSmallerElementOnLeft {

	static int [] nearestIndex(int []arr) {
		int [] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int nearIndex = -1;
			for(int j=(i-1);j>=0;j--) {
				if(arr[i]>arr[j]) {
					nearIndex = j;
					break;
				}
			}
			newArr[i] = nearIndex;
		}
		return newArr;                                          //              TC = O[N^2]           SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {4,5,2,10,3,2};
		System.out.println(Arrays.toString(nearestIndex(arr)));
	}
}
