package com.rahul.kumar.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Program6PrintTheOutputOf2DArrayListAsShown {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al2D = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(-1);
		al1.add(4);
		al1.add(3);
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(5,2));
		ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(9,2,4,1,6));
		
		al2D.add(al1);
		al2D.add(al2);
		al2D.add(al3);
		System.out.println(al2D);
	}
}


// -1 4 3 
//  5 2
//  9 2 4 1 6