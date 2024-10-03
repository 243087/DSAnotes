package com.rahul.kumar.scaler.Module5Day30_Recursion;

public class Program3_GivenAnArrayReturnTheMaxElement {

	static int maxElement(int []arr,int idx) {
		if(idx == arr.length-1) {
			return arr[idx];
		}
		int max = maxElement(arr,idx+1);
		return Math.max(arr[idx], max);
	}                                                        //        TC = O[N]        SC = O[N]
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		System.out.println(maxElement(arr,0));
	}
}
