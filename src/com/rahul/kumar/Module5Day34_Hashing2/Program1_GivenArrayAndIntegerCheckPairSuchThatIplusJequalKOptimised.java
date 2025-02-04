package com.rahul.kumar.Module5Day34_Hashing2;


//Given an arr[N] and K. Check if there exists a pair (i,j) such that, arr[i] + arr[j] = K  &&  i!= j 
import java.util.HashSet;

public class Program1_GivenArrayAndIntegerCheckPairSuchThatIplusJequalKOptimised {

	static boolean checkPair(int []arr,int num) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int need = num-arr[i];
			if(hs.contains(need))
				return true;
			hs.add(arr[i]);
		}
		return false;                                    //           TC = O[N]          SC = O[N]
	}
	public static void main(String[] args) {
		int []arr = {8,9,1,-2,4,5,11,-6,4};
		int num = 8;
		System.out.println(checkPair(arr,num));
	}
}
