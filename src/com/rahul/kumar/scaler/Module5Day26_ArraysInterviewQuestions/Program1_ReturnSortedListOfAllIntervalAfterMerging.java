package com.rahul.kumar.scaler.Module5Day26_ArraysInterviewQuestions;

public class Program1_ReturnSortedListOfAllIntervalAfterMerging {

	static void mergeInterval(int [][]arr) {
		int cs = arr[0][0];
		int ce = arr[0][1];                             //  s1 e1        s2 e2
		                                                //  cs ce        s  e
		for(int i=1;i<arr.length;i++) {
			int s = arr[i][0];
			int e = arr[i][1];
			
			// for Overlap
			if(ce>=s) {
				cs = Math.min(cs,s);
				ce = Math.max(ce,e);                    //                TC = O[N]        SC = O[1]
			}
			else {
				System.out.println(cs+","+ce);
				cs = s;
				ce = e;
			}
		}
		
		System.out.println(cs+","+ce);
	}
	public static void main(String[] args) {
		int [][]arr = {{0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14}};
		
		mergeInterval(arr);
	}
}
