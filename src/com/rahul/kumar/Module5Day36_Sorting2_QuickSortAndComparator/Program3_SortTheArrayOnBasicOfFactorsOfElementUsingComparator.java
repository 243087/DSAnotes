package com.rahul.kumar.Module5Day36_Sorting2_QuickSortAndComparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



//Given arr[N], sort the data in ascending order of count of factors.If count of factors are equal, then sort the elements on the basis of their values.
public class Program3_SortTheArrayOnBasicOfFactorsOfElementUsingComparator {

	static ArrayList<Integer> factorsSort(ArrayList<Integer> al){
		Collections.sort(al, new Comparator<Integer>() {

			public int compare(Integer f, Integer s) {
				int cf = factorsCount(f);
				int cs = factorsCount(s);
				
				if(cf<cs)
					return -1;
				if(cf>cs)
					return 1;
				
				// when factors both element is same i.e cf == cs
				if(f<s)
					return -1;
				if(f>s)
					return 1;
				
				
				return 0;
			}
		});
		return al;
	}
	
	static int factorsCount(int num) {
		int count = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				count++;
				if (i != num / i)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>(Arrays.asList(9,3,10,6,4));        //         9 3 10 6 4
	//	System.out.println(al);                                                     //         3 2  4 6 4
		System.out.println(factorsSort(al));
	}
}
