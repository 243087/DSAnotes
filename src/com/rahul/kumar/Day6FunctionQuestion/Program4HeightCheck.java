package com.rahul.kumar.Day6FunctionQuestion;

import java.util.Scanner;

public class Program4HeightCheck {

	static String checkHeight(int a) {
		if(a<10)
			return "Small";
		else if(a>=10 && a<=20)
			return "Medium";
		else
			return "Large";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height");
		int height = sc.nextInt();
		System.out.println(checkHeight(height));
	}
}
