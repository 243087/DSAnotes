package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program3SumOfAllEvenElementFromIndexLToR {

	static void sumOfEvenElements(int []arr, int [][]index) {
		for(int i=0;i<index.length;i++) {
			int l = index[i][0];
			int r = index[i][1];
			int sum =0;
			for(int j=l;j<=r;j++) {
				if(j%2==0)
					sum+=arr[j];
			}
			System.out.print(sum+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 int [][] indexedArray = {{4,8},{3,7},{1,3},{0,4},{7,7}};
		 sumOfEvenElements(arr,indexedArray);
	}
}
//  -3 6 2 4 5 2 8 -9 3 1
//   0 1 2 3 4 5 6  7 8 9