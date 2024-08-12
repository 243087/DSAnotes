package com.rahul.kumar.scaler.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program7PrintTheOuputOf2DArrayListByUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
		System.out.println("Enter the row : ");
		int row = sc.nextInt();
		for(int i=0;i<row;i++) {
			System.out.println("Enter the column in "+i+" row ");
			int col = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("Enter the elements in "+i+" column");
			for(int j=0;j<col;j++) {
				int value = sc.nextInt();
				list.add(value);
			}
			al.add(list);
		}
		System.out.println(al);
	}
}
