 package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

public class Program2_StairsBy_Recursion {

	static int stairs(int num) {
		if(num==0)
			return 1;
		if(num==1 || num==2)
			return num;
		return stairs(num-1) + stairs(num-2);                        //        TC = O[2^n]        SC = O[N]
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(stairs(num));
	}
}
