package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

// Find the smallest number that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form of an array.
//Note: Elements Of Array must be in range of 0-9
public class Program1_ReturnTheSmallestNumberInTheFormOfArrayForPositiveValue1 {

	static int[] sortTheArray(int[] arr) {
		int[] freqArr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			freqArr[value]++;
		}

		int k = 0;
		for (int i = 0; i <= 9; i++) {
			int freq = freqArr[i];
			for (int j = 1; j <= freq; j++) {
				arr[k] = i;
				k++;
			}
		}
		return arr;                                                        // TC = O[N]         SC = O[1]
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 2, 5, 4, 2, 1, 2, 5, 8,0,0};
		System.out.println(Arrays.toString(sortTheArray(arr)));
	}
}
