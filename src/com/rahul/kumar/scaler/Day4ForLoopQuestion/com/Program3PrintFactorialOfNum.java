package com.rahul.kumar.scaler.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program3PrintFactorialOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number");
		int factNum = sc.nextInt();
		
		if(factNum<=0)
			System.out.println("Please enter +ve Natual Number");
		else {
			for(int i=1;i<=(factNum/2);i++) {
				if(factNum % i ==0) {
					System.out.print(i+" ");
				}
			}
		}System.out.println(factNum);
	}
}
