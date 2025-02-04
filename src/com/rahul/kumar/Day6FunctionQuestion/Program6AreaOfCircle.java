package com.rahul.kumar.Day6FunctionQuestion;

import java.util.Scanner;

public class Program6AreaOfCircle {

	static double areaOfCircle(double r) {
		return 3.14*r*r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		
		System.out.println(areaOfCircle(radius));
		
	}
}
