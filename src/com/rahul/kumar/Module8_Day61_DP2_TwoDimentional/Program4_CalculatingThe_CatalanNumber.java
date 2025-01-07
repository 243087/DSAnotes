package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

import java.util.Arrays;

public class Program4_CalculatingThe_CatalanNumber {

	static int findCatalan(int num) {
		int [] arr = new int[num+1];
		Arrays.fill(arr,0);
		arr[0] = 1;
		arr[1] = 1;
		
		for(int n=2;n<=num;n++) {
			for(int j=0;j<n;j++) {
				arr[n] += arr[j]*arr[n-j-1];
			}
		}
		return arr[num];                                           //             TC = O[N^2]          SC = O[N]
	}
	public static void main(String[] args) {
		int num = 4;
		System.out.println("Catalan_Number "+ findCatalan(num));
	}
}
