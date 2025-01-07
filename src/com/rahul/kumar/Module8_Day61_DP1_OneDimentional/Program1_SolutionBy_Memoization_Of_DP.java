package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

//   Memoization approach is also called as Top-down approach
public class Program1_SolutionBy_Memoization_Of_DP {

	
	static int findFibo(int num) {
		int []arr = new int[num+1];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		if(num==0 || num==1)
			 return num;
		if(arr[num]!=-1)
			 return arr[num];
		
		arr[num] = findFibo(num-1) + findFibo(num-2);
		return arr[num];                                               //          TC = O[N]         SC = O[N]
	}
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num = sc.nextInt();
		  System.out.println(findFibo(num));
		}
}
