package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

public class Program1_HouseRobber_Memoization_OR_TopDown {

	     static int rob(int[] nums) {
	    	
	        // Edge case: if the array is empty
	        if (nums == null || nums.length == 0) return 0;
	        
	    	// Edge case: if there's only one house
	    	if(nums.length==1)
	    		return nums[0];
	    	
	    	int []dp = new int[nums.length];
	    	for(int i=0;i<dp.length;i++) {                                //       TC = O[N]       SC = O[N] 
	    		dp[i] = -1;
	    	}
            return robHelper(nums,nums.length-1,dp);
	    }
	    static int robHelper(int []nums,int i,int []dp) {
	    	if(i<0)
	    		return 0;
	    	if(dp[i]!=-1)
	    		return dp[i];
	    	
	    	int include = nums[i] + robHelper(nums,i-2,dp);
	    	int exclude = robHelper(nums,i-1,dp);
	    	
	    	dp[i] = Math.max(include,exclude);
	    	return dp[i];
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 7, 9, 3, 1};
	        System.out.println("Maximum amount robbed: " + rob(nums));
	    }
}
