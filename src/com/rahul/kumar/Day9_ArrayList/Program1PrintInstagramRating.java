package com.rahul.kumar.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1PrintInstagramRating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the Element to stored");
		while(true) {
			int value = sc.nextInt();
			if(value<0) {
				break;
			} 
			al.add(value);
		}
		System.out.println("Direct printing "+al);
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
	}
}
