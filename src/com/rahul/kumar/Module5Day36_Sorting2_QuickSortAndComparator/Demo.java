package com.rahul.kumar.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static  ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer f, Integer s){
                return s-f;
            }
        });
        return A;
    }
	
	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>(Arrays.asList(9,3,10,6,4));
		System.out.println(solve(al));
	}
}
