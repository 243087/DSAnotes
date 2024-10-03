
package com.rahul.kumar.scaler.Module6Day38_Searching_BinarySearch2;

import java.util.Scanner;

public class Program2_FindTheFloorOfNumberByLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int ans = 0;
		for(int i=1;i<=num;i++) {
			if(i*i<=num)
				ans = i;                               //                     TC = O[N]           SC = O[1]
		}
		System.out.println(ans);
	}
}
