package com.rahul.kumar.Module6Day38_Searching_BinarySearch2;

import java.util.Scanner;

public class Program2_FindTheFloorOfNumberByBinarySearch {

	static int findFloor(int num) {
		int l = 1;
		int r = num;
		int ans =0;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(mid*mid<=num) {
				ans = mid;
				l = mid+1;
			}
			else
				r  = mid-1;
		}
		return ans;                             //              TC = O[logN]             SC = O[1]
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println(findFloor(num));
	}
}
