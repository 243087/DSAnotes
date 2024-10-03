package com.rahul.kumar.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program9ReturnNumericStairCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for(int i=1;i<=num;i++) {
			ArrayList<Integer> alInner = new ArrayList<>();
			for(int j=1;j<=i;j++) {
				alInner.add(j);
			}
			al.add(alInner);
		}
		System.out.println(al);
	}
}



//               input = 3
//                 [[1],
//                  [1,2],
//                  [1,2,3]]