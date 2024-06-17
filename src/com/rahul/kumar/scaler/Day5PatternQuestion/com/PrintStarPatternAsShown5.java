package com.rahul.kumar.scaler.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=(num+1)-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=(2*i)-2;k++) {
				System.out.print(" ");
			}
			for(int l =1;l<=(num+1)-i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




// for n = 4

//          * * * * * * * *
//          * * *     * * *
//          * *         * *
//          *             *
