package com.rahul.kumar.scaler.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program1SumOfAllElementFromIndexLtoR {

	static void sumOfElements(int []orgArr, int [][]index) {
		for(int i=0;i<index.length;i++) {                 // this loop is for no of times query run
			int l= index[i][0];
			int r= index[i][1];
			int sum =0;
			for(int j=l;j<=r;j++) {
				sum += orgArr[j];
			}
		System.out.print(sum+" ");                   // Time complexity = O[N*N]   || Space complexity =O[1]
		}
	}
	public static void main(String[] args) {
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 int [][] indexedArray = {{4,8},{3,7},{1,3},{0,4},{7,7}};
		sumOfElements(arr,indexedArray);
	}
}
