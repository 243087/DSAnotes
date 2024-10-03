package com.rahul.kumar.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program6ContinueStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.print("Even Nums are : ");
		for(int i=1;i<=num;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
