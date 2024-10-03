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
                int cf = CountFactors(f);
                int cs = CountFactors(s);
                if(cf<cs)
                	 return -1;
                if(cf>cs)
                	 return 1;
                if(f<s)
                	return -1;
                if(f>s)
                	return 1;
                
                return 0;
            }
        });
        return A;
    }
	public static int CountFactors(int A){
        int count = 0;
        for(int i = 1; i * i <= A; i++){
            if(A % i == 0){
                if(i * i == A){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>(Arrays.asList(9,3,10,6,4));
		System.out.println(solve(al));
	}
}
