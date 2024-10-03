
package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

public class Program1_FindTheCountOfPairsOptimisedWay {

	static void countPairs(int []arr,int M) {
		int []frq = new int [M];
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			int val = arr[i]%M;
			int need = -1;
			
			if(val==0) {
				need = 0;
			}
			else {
				need = M-val;
			}
			ans +=frq[need];
			frq[val]++;
			
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {

		int []arr = {2,3,4,8,6,15,5,12,17,7,18,10,9,16,21}; 
		int modulo = 6;
		countPairs(arr,modulo);
	}
}
