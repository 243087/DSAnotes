package com.rahul.kumar.scaler.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarOfNxM {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Row :");
	int n = sc.nextInt();
	System.out.println("Enter the Column :");
	int m = sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			System.out.print("*");                           // ****
		}                                                    // ****
		System.out.println();                                // ****
	}
}
}
