package com.rahul.kumar.Module8_Day60_Greedy;

// < Question > : There are N students with their marks. Teacher has to give them candies such that:
//             a. Every student have at least one candy
//             b. Student with more marks than any of his/her neighbours have more candies than them.
//       Find minimum candies to distribute.

public class Program3_DistributedCandies_BruteForce {

	static int maxCandies(int []marks) {
		int totalCandies = 0;
		
	// Count the number of students with lower marks on the left 
		for(int i=0;i<marks.length;i++) {
			int left = 0;
			for(int j=i-1;j>=0;j--) {
				if(marks[j]<marks[i])
					 left++;
			    else
			    	 break;                                            //       TC = O[N^2]        SC = O[1]
			}
	// Count the number of students with lower marks on the right 
			int right = 0;
			for(int j=i+1;j<marks.length;j++) {
				if(marks[j]<marks[i])
					right++;
				else
					break;
			}
			int candies = Math.max(left,right) +1;
			totalCandies +=candies;
		}
		return totalCandies;
	}
	 public static void main(String[] args) {
	        int[] marks = {1,5,2,1}; 
	        System.out.println("Total candies distributed: " + maxCandies(marks));
	    }
}
