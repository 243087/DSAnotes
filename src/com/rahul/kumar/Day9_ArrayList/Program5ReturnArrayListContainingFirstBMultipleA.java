package com.rahul.kumar.Day9_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Program5ReturnArrayListContainingFirstBMultipleA {

	static ArrayList<Integer> printMultiple(int num,int multiple){
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<multiple;i++) {
			al.add(num*(i+1));
		}
		return al;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the multiple");
		int multiple = sc.nextInt();
		
		System.out.println(printMultiple(num, multiple));
	}
}
