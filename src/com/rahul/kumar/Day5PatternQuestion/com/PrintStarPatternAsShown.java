package com.rahul.kumar.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
			else {
				System.out.print("*"+" ");
			}
		}
		System.out.println();
	}
}
}


// for n = 3                        for n = 4

//    *                                    *
//    * 2                                  * 2
//    * 2 *                                * 2 *
//                                         * 2 * 4