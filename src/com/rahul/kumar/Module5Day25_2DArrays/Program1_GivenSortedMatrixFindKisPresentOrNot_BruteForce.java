package com.rahul.kumar.Module5Day25_2DArrays;

import java.util.Scanner;
// <Question> : Given a matrix which is row wise and column wise sorted.Find out whether k is present or not
public class Program1_GivenSortedMatrixFindKisPresentOrNot_BruteForce {

	static boolean findElement(int [][]arr,int k) {
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(arr[r][c]==k)
					return true;
			}
		}                                                   //                  TC = O[N^2]        SC = O[1]
		return false;
	}
	public static void main(String[] args) {
		int [][]arr = {{-5,-2,1,13},{-4,0,3,14},{-3,2,6,18}};
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean ans = findElement(arr,num);
		System.out.println(ans);
	}
}
