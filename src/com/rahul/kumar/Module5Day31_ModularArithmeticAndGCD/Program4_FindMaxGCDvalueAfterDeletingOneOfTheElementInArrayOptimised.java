package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

public class Program4_FindMaxGCDvalueAfterDeletingOneOfTheElementInArrayOptimised {

	static void maxGCD(int []arr) {
		// first create prefix GCD array
		int []pgcd = new int[arr.length];
		pgcd[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			pgcd[i] = GCD(pgcd[i-1],arr[i]);
		}
		// create the suffix GCD
		int []sgcd = new int[arr.length];
		sgcd[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			sgcd[i] = GCD(sgcd[i+1],arr[i]);
		}
		int ans =1;
		for(int i=0;i<arr.length;i++) {
			int lgcd =0;
			int rgcd =0;
			
			if(i>0)
				 lgcd = pgcd[i-1];
			if(i<arr.length-1)
				 rgcd = sgcd[i+1];
			
			ans = Math.max(ans,GCD(lgcd, rgcd));
		}
		System.out.println(ans);
	}
	static int GCD(int a,int b) {
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
	public static void main(String[] args) {
		int []arr = {24,16,18,30,15};
		maxGCD(arr);
	}
}
