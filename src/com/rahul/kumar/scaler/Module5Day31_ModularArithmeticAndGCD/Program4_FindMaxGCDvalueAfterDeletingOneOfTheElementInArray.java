package com.rahul.kumar.scaler.Module5Day31_ModularArithmeticAndGCD;


//Given arr[N]. Find maximum GCD value after deleting one of the elements from array.
public class Program4_FindMaxGCDvalueAfterDeletingOneOfTheElementInArray {

	static void maxGCD(int []arr) {
		int ans =1;
		for(int i=0;i<arr.length;i++) {
			int x =0;
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					continue;
				x = gcd(arr[j],x);
			}
			ans = Math.max(ans, x);
		}
		System.out.println(ans);                   //             TC = O[N^2logmax]       SC = O[logmax]
	}
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		int []arr = {21,7,2,14};
		maxGCD(arr);
	}
}
