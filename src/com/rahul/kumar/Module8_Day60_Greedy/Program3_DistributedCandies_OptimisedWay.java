package com.rahul.kumar.Module8_Day60_Greedy;

public class Program3_DistributedCandies_OptimisedWay {

	static int maxCandies(int []marks) {
		int n = marks.length;
		int [] l = new int [n];
		int [] r = new int [n];
		
		for(int i=0;i<n;i++) {
			l[i] = 1;
			r[i] = 1;
		}
		 // Traverse from left to right and calculate l[i]
		for(int i=1;i<n;i++) {
			if(marks[i]>marks[i-1])
				l[i] = l[i-1]+1;
		}
		 // Traverse from left to right and calculate l[i]
		for(int i=n-2;i>=0;i--) {                                         //      TC = O[N]        SC = O[N]
			if(marks[i]>marks[i+1])
				r[i] = r[i+1]+1;
		}
		int totalCandies = 0;
	        for (int i = 0; i < n; i++) {
	            totalCandies += Math.max(l[i],r[i]);
	        }

	     return totalCandies;
	}
	public static void main(String[] args) {
        int[] marks = {1,5,2,1}; 
        System.out.println("Total candies distributed: " + maxCandies(marks));
    }
}
