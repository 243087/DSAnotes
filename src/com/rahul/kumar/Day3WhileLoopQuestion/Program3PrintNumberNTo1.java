package com.rahul.kumar.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program3PrintNumberNTo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num>0) {
			System.out.print(num+" ");
			num--;
		}
	}
}
