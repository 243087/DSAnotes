package com.rahul.kumar.scaler.Module5Day24_1DArrays;

public class Program4_RainWaterTrappingInOptimisedWay {
	static void storeWater(int []arr) {
		// for preFix Max
		int []preMax = new int [arr.length];
		preMax[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			preMax[i] = Math.max(preMax[i-1],arr[i]);                     
		}
		
		//for suffix Max
		int []sufMax = new int [arr.length];
		sufMax[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			sufMax[i] = Math.max(sufMax[i+1],arr[i]);
		}
		int water =0;                                       //                   TC = O[N]               SC = O[N]
		for(int j=1;j<arr.length-1;j++) {
			int lMax = preMax[j];
			int rMax = sufMax[j];
			water += Math.min(lMax, rMax) -arr[j];
		}
		System.out.println(water);
		
	}
	public static void main(String[] args) {
		int []arr = {4,2,5,7,5,2,3,6,2,3};
		storeWater(arr);
	}
}
