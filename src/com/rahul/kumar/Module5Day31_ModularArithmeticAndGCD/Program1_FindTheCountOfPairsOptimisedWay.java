
package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

//<Question> : Given N array elements. Find the count of pairs ( i, j ) such that ( arr [ i ] + arr [ j ] ) % m = 0.
//NOTE :      i !=  j and pair ( i, j ) is same as pair ( j, i )

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
		System.out.println(ans);                            //           TC = O[N+M]   SC = O[M]
	}
	public static void main(String[] args) {

		int []arr = {2,3,4,8,6,15,5,12,17,7,18,10,9,16,21}; 
		int modulo = 6;
		countPairs(arr,modulo);
	}
}
