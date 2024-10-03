package com.rahul.kumar.Module4Day23InterviewQuestions;

public class Program1_FindMaxConsecutive1ObtainByReplacing0With1 {

	static int findMaxOne(int []arr) {
//      Handling all the one 
		int countOnes =0;
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1)
				countOnes++;
		}
		if(countOnes==arr.length)
			 return countOnes;

			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
	//           Consecutive one's on left
					int left =0;
					for(int j=(i-1);j>=0;j--) {
					    if(arr[j]==1) {
					    	left++;
					    }
					    else {
					    	break;
					    }
					}                                                          //   TC = O[N]         SC = O[1]
//		           Consecutive one's on Right					 
					int right =0;
					for(int j=(i+1);j<arr.length;j++) {
						if(arr[j]==1) {
							right++;
						}
						else {
							break;
						}
					}
					ans = Math.max(ans,(left+right+1));
				}
			}
		return ans;
	}
	public static void main(String[] args) {
		int []arr = {1,1,0,1,1,0,1};
		System.out.println(findMaxOne(arr));
	}
}
