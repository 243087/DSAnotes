package com.rahul.kumar.Day6FunctionQuestion;

import java.util.Scanner;

public class Program1ToAddTwoInteger {

	static int addTwoNum(int a, int b) {
		return (a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Sum of "+num1+" and "+num2+" is "+addTwoNum(num1,num2));
	}
}
