package com.rahul.kumar.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3TakeInputFromUserAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the element to store");
		for(int i=0;i<size;i++) {
			int value = sc.nextInt();
			al.add(value);
		}
		System.out.println("Elements of ArrayList are : "+al);
	}
}
