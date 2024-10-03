package com.rahul.kumar.Module7Day47_MathCombinatoricsBasics;

import java.util.ArrayList;

public class Program1_GenerateThePascalsTriangleForGivenN {

	static ArrayList<ArrayList<Integer>> generateTriangle(int n){
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
		
		for(int r=0;r<=n;r++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int c=0;c<=r;c++) {
				row.add(computeCombination(r,c));
			}
			triangle.add(row);
		}
		return triangle;                                  //                  TC = O[N^3]
	}
	
	static int computeCombination(int r,int c) {
		return factorial(r)/(factorial(r-c)*factorial(c));
	}
	
	static int factorial(int n) {
		if(n==0 || n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int n = 4;
		ArrayList<ArrayList<Integer>> result = generateTriangle(n);
		
		 for (ArrayList<Integer> row : result) {
	            System.out.println(row);
	        }
	}
}
