package com.rahul.kumar.Module8_Day61_DP1_OneDimentional;

import java.util.Scanner;

//  Tabulation approach is also called as the Bottom-Up approach
public class Program1_SolutionBy_Tabulation_Of_DP {

	static int findFibo(int num) {
		int []arr = new int[num+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<=num;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[num];                                     //           TC = O[N]          SC = O[N]
	}
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num = sc.nextInt();
		  System.out.println(findFibo(num));
		}
}
