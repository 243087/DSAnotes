package com.rahul.kumar.Module5Day34_Hashing2;

//Given an arr[N] and K. Check if there exists a pair (i,j) such that, arr[i] + arr[j] = K  &&  i!= j 

public class Program1_GivenArrayAndIntegerCheckPairSuchThatIplusJequalK {

	static boolean checkPair(int []arr,int num) {
		for(int i=0;i<arr.length;i++) {
			int need = num-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(need == arr[j])
					 return true;
			}
		}
		return false;                                             //            TC = O[N^2]           SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {8,9,1,-2,4,5,11,-6,4};
		int num = 6;
		System.out.println(checkPair(arr,num));
	}
}
