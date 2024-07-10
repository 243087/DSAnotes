package com.rahul.kumar.scaler.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program1SumOfAllElementFromIndexLtoRInOptimisedWay {

	static void sumOfElements (int [] orgArr, int [][]index) {
		//first create the preFix sum array
		int [] preSumArr = new int [orgArr.length];
		preSumArr[0] = orgArr[0];
		for(int i=1;i<orgArr.length;i++) {                            //   O[M]
			preSumArr[i] = preSumArr[i-1] + orgArr[i];
		}
		System.out.println("preFix Sum array is : "+Arrays.toString(preSumArr));
		for(int j=0;j<index.length;j++) {                            //     O[N]
			int l =index[j][0];
			int r =index[j][1];
			int sum =0;
			if(l == 0)
				sum +=preSumArr[r];
			else
				sum += preSumArr[r] - preSumArr[l-1];
			
			System.out.print(sum+" ");                         //  Time complexity =O[M+N]    || Space complexity = O[N]
		}
	}
	public static void main(String[] args) {
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
		 System.out.println("Given array is "+Arrays.toString(arr));
		 int [][] indexedArray = {{4,8},{3,7},{1,3},{0,4},{7,7}};
		sumOfElements(arr,indexedArray);
	}
}
