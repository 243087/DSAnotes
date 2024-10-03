package com.rahul.kumar.Module5Day24_1DArrays;

import java.util.Arrays;

public class Program2_AddXtoAllNumberFromStartToEndForGivenQueryQInOptimisesWay {

	static void addElement(int []arr, int [][]index) {
		for(int i=0;i<index.length;i++) {
			int l=index[i][0];
			int x=index[i][1];
			
			arr[l] +=x;
		}
		for(int j=1;j<arr.length;j++) {
			arr[j] += arr[j-1];                      //  this is preFix sum calculation for same array
		}
		System.out.println(Arrays.toString(arr));                 //          TC = O[N+Q]         SC = O[1]
	}
	
	public static void main(String[] args) {
		int []arr = {0,0,0,0,0,0,0};
		int [][] query = {{1,3},{4,-2},{3,1}};
		addElement(arr,query);
	}
}
