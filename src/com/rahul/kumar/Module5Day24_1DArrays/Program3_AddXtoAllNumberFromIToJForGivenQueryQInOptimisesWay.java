package com.rahul.kumar.Module5Day24_1DArrays;

import java.util.Arrays;

public class Program3_AddXtoAllNumberFromIToJForGivenQueryQInOptimisesWay {

	static void addElement(int []arr, int [][]query) {
		for(int i=0;i<query.length;i++) {
			int l = query[i][0];
			int r = query[i][1];
			int x = query[i][2];
			
			arr[l] += x;
			if((r+1)<arr.length)
				 arr[r+1] -= x;
		}
		for(int j=1;j<arr.length;j++) {
			arr[j] += arr[j-1]; 
		}
		System.out.println(Arrays.toString(arr)); 
	}
	
	public static void main(String[] args) {
		int []arr = {0,0,0,0,0,0,0,0};
		int [][] query = {{1,4,3},{0,5,-1},{2,2,4},{4,6,3}};
		addElement(arr,query);
	}
}


