package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program4PrintOddNumberBt1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num  = sc.nextInt();
		System.out.print("Odd Numbers are :");
		int odd = 1;
		while(odd<=num) {
			if(odd%2 ==1)
			   System.out.print(odd+" ");
			
			odd++;
		}
	}
}
