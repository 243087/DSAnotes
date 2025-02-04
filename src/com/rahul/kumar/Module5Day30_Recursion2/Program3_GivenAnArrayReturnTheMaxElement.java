package com.rahul.kumar.Module5Day30_Recursion2;

public class Program3_GivenAnArrayReturnTheMaxElement {

	static int maxElement(int []arr) {
		int ans = max(arr,0);
		return ans;
	}
	static int max(int []arr,int idx) {
		if(idx == arr.length-1) {
			return arr[idx];
		}
		int max = max(arr,idx+1);
		return Math.max(arr[idx], max);
	}                                                        //        TC = O[N]        SC = O[N]
	public static void main(String[] args) {
		int []arr = {1,2,3,41,5};
		System.out.println(maxElement(arr));
	}
}
