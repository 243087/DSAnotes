package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

public class Program2_StairsBy_Tabulation_Of_DP {

	static int stairsfind(int num) {
		int []arr = new int[num+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3;i<=num;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[num];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(stairsfind(num));
	}
}
