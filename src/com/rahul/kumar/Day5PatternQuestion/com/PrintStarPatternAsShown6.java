package com.rahul.kumar.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=num-i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}



// for n= 4

//    _ _ _ * _ _ _
//    _ _ * * * _ _
//    _ * * * * * _
//    * * * * * * *