package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

// < Question > : Find the minimum number of perfect squares required to get sum = N?
public class Program3_MinimumNumberofSquares {

	static int minSquare(int num) {
		int []arr = new int[num+1];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		
		if(num==0)
			return num;
		if(arr[num]!=-1)
			return arr[num];
		
		int ans = Integer.MAX_VALUE;
		for(int i=1;i*i<=num;i++) {
			ans = Math.min(ans,minSquare(num-i*i));
		}                                                        //     TC = O[N*N^1/2]      
		arr[num] = ans+1;
		return ans+1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(minSquare(num));
	}
}
