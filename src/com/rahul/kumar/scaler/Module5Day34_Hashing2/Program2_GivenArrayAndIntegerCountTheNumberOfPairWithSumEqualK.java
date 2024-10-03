package com.rahul.kumar.scaler.Module5Day34_Hashing2;


//  Count the number of pairs with sum = K
public class Program2_GivenArrayAndIntegerCountTheNumberOfPairWithSumEqualK {

	static int countPair(int []arr,int num) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int need = num - arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(need == arr[j])
					count++;
			}
		}
		return count;                                     //                  TC = O[N^2]           SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {2,5,2,5,8,5,2,8};
		int num = 10;
		System.out.println(countPair(arr,num));
	}
}
