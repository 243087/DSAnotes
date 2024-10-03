package com.rahul.kumar.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program2PrintOddNum1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number");
		int oddNum = sc.nextInt();
		
		for(int i=1;i<=oddNum;i++) {
			if(i%2 ==0) {
				
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
}
