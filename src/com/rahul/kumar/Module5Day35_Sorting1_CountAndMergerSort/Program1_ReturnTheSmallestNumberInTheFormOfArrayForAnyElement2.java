package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;

import java.util.Arrays;

public class Program1_ReturnTheSmallestNumberInTheFormOfArrayForAnyElement2 {

	static int [] sortTheArray(int []arr) {
	     int[] posFreqArr = new int[10]; // Frequency array for digits 0 to 9
	     int[] negFreqArr = new int[10]; // Frequency array for digits -9 to -1
	     
	     // count the frequency
	     
	     for(int i=0;i<arr.length;i++) {
	    	 int value = arr[i];
	    	 if(value>=0)
	    		 posFreqArr[value]++;
	    	 else
	    		 negFreqArr[-value]++;
	     }
	   
	     // add for -ve digit element
	     int k = 0;
	     for(int i=9;i>=1;i--) {        // from -9 to -1 (negative numbers)
	    	 int negFreq = negFreqArr[i];
	    	 for(int j=1;j<=negFreq;j++) {
	    		 arr[k] = -i;
	    		 k++;
	    	 }
	     }
	     
	     
	     // add for zero & +ve digit element
	     
	     for(int i=0;i<=9;i++) {
	    	 int posFreq = posFreqArr[i];
	    	 for(int j=1;j<=posFreq;j++) {
	    		 arr[k] = i;
	    		 k++;
	    	 }
	     }
	     return arr;                           //                   TC = O[N]                SC = O[1]
	     
	}
	public static void main(String[] args) {
		int []arr = {-2,3,8,3,-2,3};
		System.out.println(Arrays.toString(sortTheArray(arr)));
	}
}
