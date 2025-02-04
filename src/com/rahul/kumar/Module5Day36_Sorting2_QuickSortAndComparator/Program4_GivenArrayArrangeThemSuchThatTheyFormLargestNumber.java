package com.rahul.kumar.Module5Day36_Sorting2_QuickSortAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Program4_GivenArrayArrangeThemSuchThatTheyFormLargestNumber {

	static String largestNumber(ArrayList<Integer> al) {
		Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
                String sa = a.toString();
                String sb = b.toString();
                
                String x = sa+sb;
                String y = sb+sa;
                
                if(x.compareTo(y)>0)
                	return -1;
                if(x.compareTo(y)<0)
                	return 1;
                
				return 0;
			}
			
		});
		System.out.println(al);
		StringBuilder result = new StringBuilder();
		for(int i=0;i<al.size();i++) {
			int value = al.get(i);
			result.append(value);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>(Arrays.asList(0,30,34,5,900,999));
		System.out.println(largestNumber(al));
	}
}
