package com.rahul.kumar.Module5Day24_1DArrays;

import java.util.Arrays;

public class Program2_AddXtoAllNumberFromStartToEndForGivenQueryQ_BruteForce {

	static void addElement(int []arr, int [][]index) {
		for(int i=0;i<index.length;i++) {
			int l=index[i][0];
			int x=index[i][1];
			
			for(int j=l;j<arr.length;j++) {
				arr[j] += x;
			}
		}
		System.out.println(Arrays.toString(arr));             //                  TC = O[Q*N]         SC = O[1]
	}
	
	public static void main(String[] args) {
		int []arr = {0,0,0,0,0};
		int [][] query = {{1,3},{0,2},{4,1}};
		addElement(arr,query);
	}
}
