package com.rahul.kumar.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program7Scoping {

	public static void main(String[] args) {

		int x = 10;
		{
			int y = 20;
			System.out.println(x+" "+y);
		}
		{
		//	System.out.println(y);
		}
	}
}
