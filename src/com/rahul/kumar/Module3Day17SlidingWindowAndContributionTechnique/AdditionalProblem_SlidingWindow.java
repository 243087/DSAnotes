package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

import java.util.ArrayList;

// Count distinct elements in every window
public class AdditionalProblem_SlidingWindow {

	static ArrayList<Integer> countDistinctElements(int []arr, int k){
		  ArrayList<Integer> result = new ArrayList<>();
	        int l = 0;
	        int r = k-1;
	        while(r<arr.length){
	            int ans = countDistinct(arr, l, r);
	            l++;
	            r++;
	            result.add(ans);
	        }
	        return result;
	}
    static int countDistinct(int []arr, int l, int r){
	        int count = 0;
	        for(int i=l;i<=r;i++){
	            boolean isDistinct = true;
	            for(int j=l;j<i;j++){
	                if(arr[i] == arr[j]){
	                    isDistinct = false;
	                    break;
	                }
	            }
	            if(isDistinct)
	               count++;
	        }
	        return count;
	    }
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 1, 3, 4, 2, 3}; 
	        int k = 4;
	        System.out.println(countDistinctElements(arr, k)); 
	    }
}
