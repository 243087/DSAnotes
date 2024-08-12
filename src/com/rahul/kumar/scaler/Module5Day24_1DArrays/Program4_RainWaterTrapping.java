package com.rahul.kumar.scaler.Module5Day24_1DArrays;

public class Program4_RainWaterTrapping {

	static void storeWater(int []arr) {
		int water =0;
		for(int i=1;i<arr.length-1;i++) {
			int lMax = -Integer.MAX_VALUE;
			for(int j=0;j<=i;j++) {
				lMax = Math.max(lMax,arr[j]);
			}
			int rMax = -Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++) {
				rMax = Math.max(rMax,arr[j]);
			}
			water += Math.min(lMax, rMax) - arr[i];
		}
		System.out.println(water);                        //                 TC = O[N^2]         SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {10,6,2,7,5,8};
		storeWater(arr);
	}
}
