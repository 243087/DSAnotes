package com.rahul.kumar.Module6Day38_Searching_BinarySearch2;

import java.util.Scanner;

public class Program2_FindTheFloorOfNumberByLinearSearch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int ans = 0;
		for(int i=1;i*i<=num;i++) {	
			if(i*i<=num)
				ans = i;                               //                     TC = O[N^1/2]           SC = O[1]
		}
		System.out.println(ans);
	}
}
