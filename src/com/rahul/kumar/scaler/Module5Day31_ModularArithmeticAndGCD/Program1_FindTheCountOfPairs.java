package com.rahul.kumar.scaler.Module5Day31_ModularArithmeticAndGCD;

//Question 
// Given N array elements. Find the count of pairs ( i, j ) such that ( arr [ i ] + arr [ j ] ) % m = 0.
//NOTE : i !=  j and pair ( i, j ) is same as pair ( j, i )

public class Program1_FindTheCountOfPairs {

	static void countPairs(int []arr,int m) {
		int pairs = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])%m == 0)
					pairs++;
			}
		}                                            //                TC = O[N^2]         SC = O[1]
		System.out.println(pairs);
	}
	public static void main(String[] args) {

		int []arr = {4,7,6,5,8,3};
		int modulo = 6;
		countPairs(arr,modulo);
	}
}
