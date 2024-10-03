package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Demoue {

	static void sumOfElements(int []orgArr, int startIndex, int endIndex) {


			int sum =0;
			for(int j=startIndex;j<=endIndex;j++) {
				sum += orgArr[j];
			}
		System.out.print("Sum of all Element from index "+startIndex+" to "+endIndex+" "+sum);                   // Time complexity = O[N*N]   || Space complexity =O[1]
	}
	public static void main(String[] args) {
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
		 System.out.println("Given array is "+Arrays.toString(arr));
		  int startIndex = 1;
		  int endIndex = 5;
		sumOfElements(arr,startIndex,endIndex);
	}
}
