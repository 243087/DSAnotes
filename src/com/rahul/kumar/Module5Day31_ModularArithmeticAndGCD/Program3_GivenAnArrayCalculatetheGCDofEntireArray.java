package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

public class Program3_GivenAnArrayCalculatetheGCDofEntireArray {

	static int findGCD(int []arr) {
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			ans = gcd(ans,arr[i]);
		}
		return ans;
	}
	static int gcd(int ans, int i) {
		if(i==0)
			return ans;                                 //            TC = O[N*log(max)]         SC = O[log(max)]
		return gcd(i,ans%i);
	}
	public static void main(String[] args) {
		int[] arr = {12, 24, 18, 6};
        System.out.println(findGCD(arr));
	}
}
