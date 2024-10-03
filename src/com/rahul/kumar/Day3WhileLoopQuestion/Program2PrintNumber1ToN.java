package com.rahul.kumar.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program2PrintNumber1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int startNo = 1;
		while(startNo<=num) {
			System.out.print(startNo +" ");
			startNo++;
		}
	}
}
