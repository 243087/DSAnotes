package com.rahul.kumar.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program5BreakStatement {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count=1;
		for(int i = 1;i<=num/2;i++) {
		
			if(num % i==0)
				count++;
			if(count>2)
				break;
		}
		if(count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not A Prime Number");
		
	}
}
