 package com.rahul.kumar.scaler.Day9_ArrayList;

import java.util.ArrayList;

public class Program2BasicOperationOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		System.out.println("Before insertion of element "+al);
		al.add(1);
		al.add(2);
		al.add(10);
		System.out.println("After insertion of element "+al);
		System.out.println("Fetching the elements of particular position : "+al.get(2));
		
		al.set(1,97);
		System.out.println("Updated ArrayList : "+al);
		al.remove(0);
		System.out.println("After removing the array : "+al);
	}
}
