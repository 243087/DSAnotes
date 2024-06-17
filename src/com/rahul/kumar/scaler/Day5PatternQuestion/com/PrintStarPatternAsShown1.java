package com.rahul.kumar.scaler.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j==1 || j==num) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("_"+" ");
				}
			}
			System.out.println();
		}
	}
}


//for n = 3                                 for n = 4
    
//     * _ *                                       * _ _ *
//     * _ *                                       * _ _ *
//     * _ *                                       * _ _ *
//                                                 * _ _ *