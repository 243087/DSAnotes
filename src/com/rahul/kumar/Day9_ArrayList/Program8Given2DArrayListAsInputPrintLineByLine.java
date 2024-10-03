package com.rahul.kumar.Day9_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program8Given2DArrayListAsInputPrintLineByLine {

	static void print2DArray(ArrayList<ArrayList<Integer>> al) {
		for(int i=0;i<al.size();i++) {
			for(int j=0;j<al.get(i).size();j++) {
				System.out.print(al.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,4));
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(0));
		ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(10,-5,1));
		
		al.add(al1);
		al.add(al2);
		al.add(al3);
		print2DArray(al);
		
		
	}
}
