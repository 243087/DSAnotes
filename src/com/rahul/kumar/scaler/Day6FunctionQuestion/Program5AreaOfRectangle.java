package com.rahul.kumar.scaler.Day6FunctionQuestion;

import java.util.Scanner;

public class Program5AreaOfRectangle {

	static double areaOfRectangle(double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		
		System.out.println(areaOfRectangle(length,breadth));
	}
}
