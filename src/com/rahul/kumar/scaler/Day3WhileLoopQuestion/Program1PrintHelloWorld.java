package com.rahul.kumar.scaler.Day3WhileLoopQuestion;

import java.util.Scanner;

public class Program1PrintHelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
	    while(num>0) {
	    	System.out.println("Hello World");
	    	num--;
	    }
	}
}
