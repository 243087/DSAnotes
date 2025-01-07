package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

public class Program2_StairsBy_Memoization_Of_DP {


	static int stairsfind(int num) {
		int []arr = new int[num+1];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		if(num<=2)
			 return num;
		if(arr[num]!=-1)
			 return arr[num];
		
		arr[num] = stairsfind(num-1) + stairsfind(num-2);
		return arr[num];                                               //          TC = O[N]         SC = O[N]
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(stairsfind(num));
	}
}
